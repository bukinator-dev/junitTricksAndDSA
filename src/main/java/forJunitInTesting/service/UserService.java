package forJunitInTesting.service;

import forJunitInTesting.model.UserRecord;

import java.util.Map;

public interface UserService {
    String createUser(Map userDetails);
    Map updateUser(String userId, Map userDetails);
    Map getUserDetails(String userId);
    void deleteUser(String userId);
    Boolean saveUser(String firstName, String lastName);
}
