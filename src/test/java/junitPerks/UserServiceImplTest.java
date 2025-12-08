package junitPerks;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class UserServiceImplTest {

    StringBuilder output = new StringBuilder();
    /*
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    Executed method instance is : 123 - this is accumulative
    ---
    @TestInstance(TestInstance.Lifecycle.PER_METHOD)
    Executed method instance is : 1
    Executed method instance is : 2
    this is for each separate method, however, beforeAll and AfterAll in this case must be static
     */


    @AfterEach
    void printMethodInstance(){
        System.out.println("Executed method instance is : " + output);
    }

    @BeforeAll
    static void setup() {
        // Create & initialize database
    }

    @AfterAll
    static void cleanup() {
        // Close connection
        // Delete database
    }

    @Test
    @Order(1)
    @DisplayName("Create User works")
    void testCreateUser_whenProvidedWithValidDetails_returnsUserId() {
        output.append(1);
    }


    @Test
    @Order(2)
    @DisplayName("Update user works")
    void testUpdateUser_whenProvidedWithValidDetails_returnsUpdatedUserDetails() {
        output.append(2);
    }

    @Test
    @Order(3)
    @DisplayName("Find user works")
    void testGetUserDetails_whenProvidedWithValidUserId_returnsUserDetails() {
        output.append(3);
    }

    @Test
    @Order(4)
    @DisplayName("Delete user works")
    void testDeleteUser_whenProvidedWithValidUserId_returnsUserDetails() {
        output.append(4);
    }

}
