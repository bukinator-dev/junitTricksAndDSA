package forJunitInTesting.model;

public class User {
    private final String userId;
    private final String firstName;
    private final String LastName;
    public User(String userId, String firstName, String LastName) {
        this.userId = userId;
        this.firstName = firstName;
        this.LastName = LastName;
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
}
