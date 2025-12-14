package forJunitInTesting.model;

import java.util.Map;
import java.util.Objects;

public record UserRecord(String userId, String firstName, String lastName) {
    public UserRecord {
        Objects.requireNonNull(userId, "userId must not be null");
        Objects.requireNonNull(firstName, "firstName must not be null");
        Objects.requireNonNull(lastName, "lastName must not be null");
    }

    public static UserRecord fromMap(Map<String, String> map) {
        return new UserRecord(
                Objects.requireNonNull(map.get("userId"), "map.userId"),
                Objects.requireNonNull(map.get("firstName"), "map.firstName"),
                Objects.requireNonNull(map.get("lastName"), "map.lastName")
        );
    }
}
