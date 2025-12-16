package forJunitInTesting.io;

import forJunitInTesting.model.UserRecord;

import java.util.Map;

public interface UsersDatabase {
    void init();
    void close();
    Map save(String userId, Map userDetails);
    Map save(UserRecord user);
    Map update(String userId, Map user);
    Map find(String userId);
    void delete(String userId);
}
