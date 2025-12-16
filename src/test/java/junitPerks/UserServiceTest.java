package junitPerks;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

@Order(1)
public class UserServiceTest {
    @BeforeAll
    static void setup() {
        System.out.println("Test methods related to User");
    }

    @Test
    void testCreateUser_whenFirstNameIsMissing_throwsUserServiceException() {


    }
}
