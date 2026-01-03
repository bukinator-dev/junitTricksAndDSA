package junitPerks;

import com.google.common.collect.MutableClassToInstanceMap;
import forJunitInTesting.data.UsersRepository;
import forJunitInTesting.data.UsersRepositoryImpl;
import forJunitInTesting.io.UsersDatabase;
import forJunitInTesting.io.UsersDatabaseMapImpl;
import forJunitInTesting.model.UserRecord;
import forJunitInTesting.service.EmailVerificationService;
import forJunitInTesting.service.UserService;
import forJunitInTesting.service.UserServiceImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {
    /*
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    Executed method instance is : 123 - this is accumulative
    ---
    @TestInstance(TestInstance.Lifecycle.PER_METHOD)
    Executed method instance is : 1
    Executed method instance is : 2
    this is for each separate method, however, beforeAll and AfterAll in this case must be static
     */

    private static final Logger log = Logger.getLogger(UserServiceImplTest.class.getName());
    @Mock
    UsersDatabase userRepositoryMock;

    @Mock
    EmailVerificationService emailVerificationService;

    @InjectMocks
    UserServiceImpl userServiceMock; // in other words, what is being tested, with mocked dependencies like userRepositoryMock

    StringBuilder output = new StringBuilder();
    UsersDatabase userDatabase;
    UserService userService;
    String createdUserId;


    @AfterEach
    void printMethodInstance(TestInfo testInfo){
        log.info("Executed method instance is : " + output);
        log.info("---");
        log.info("Test executed: " + testInfo.getDisplayName());
        log.info("Method: " + testInfo.getTestMethod().orElse(null));
        log.info("Class: " + testInfo.getTestClass().orElse(null));
        log.info("Tags: " + testInfo.getTags());
    }

    @BeforeAll
    void setup() {
        // Create & initialize database
        userDatabase = new UsersDatabaseMapImpl();
        UsersRepository userRepository = new UsersRepositoryImpl();
        userDatabase.init();
        userService = new UserServiceImpl(userRepository, emailVerificationService);
    }



    @AfterAll
    void cleanup() {
        // Close connection
        // Delete database
        userDatabase.close();
    }

    @Test
    @DisplayName("Save user works")
    void testSaveUser_whenProvidedWithValidNames_returnsTrue() {
        output.append(5);
        //Arrange
        Mockito.when(userRepositoryMock.save(any(UserRecord.class))).thenReturn(new UserRecord("2", "Bob", "Builder").toMap());
        //Act

        Boolean result2 = userServiceMock.saveUser("Bob", "Builder");
        //Assert

        assertEquals(true, result2, "Saving Bob should return true");
    }

    @Test
    @Order(1)
    @DisplayName("Create User works")
    void testCreateUser_whenProvidedWithValidDetails_returnsUserId() {
        output.append(1);
        //Arrange
        Map<String,String> user = new HashMap<>();
        user.put("firstName", "John");
        user.put("lastName", "Doe");
        //Act
        createdUserId = userService.createUser(user);
        log.info(createdUserId);

        //Assert
        assertNotNull(createdUserId, "Created user id should not be null");
        assertEquals(user.get("firstName"), userDatabase.find(createdUserId).get("firstName"), "First name should match");
    }


    @Test
    @Order(2)
    @DisplayName("Update user works")
    void testUpdateUser_whenProvidedWithValidDetails_returnsUpdatedUserDetails() {
        output.append(2);
        //Arrange
        Map<String,String> updatedDetails = new HashMap<>();
        updatedDetails.put("firstName", "Jane");
        updatedDetails.put("lastName", "Smith");
        //Act
        Map updateUserDetails = userService.updateUser(createdUserId, updatedDetails);

        //Assert
        assertNotNull(updateUserDetails, "Updated user details should not be null");
    }

    @Test
    @Order(3)
    @DisplayName("Find user works")
    void testGetUserDetails_whenProvidedWithValidUserId_returnsUserDetails() {
        output.append(3);
        //Act
        Map userDetails = userService.getUserDetails(createdUserId);
        //Assert
        assertNotNull(userDetails, "User details should not be null");

    }

    @Test
    @Order(4)
    @DisplayName("Delete user works")
    void testDeleteUser_whenProvidedWithValidUserId_returnsUserDetails() {
        output.append(4);
        //Act
        userService.deleteUser(createdUserId);
        Map userDetails = userService.getUserDetails(createdUserId);
        //Assert
        assertEquals(null, userDetails, "User details should be null after deletion");
    }



}
