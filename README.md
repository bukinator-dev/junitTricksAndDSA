# JUnit Tips & LeetCode Tests

This repository contains examples and tests showcasing various JUnit tips and tricks, plus a collection of LeetCode solution tests. It is intended as a learning and reference project for writing tests, using test lifecycle controls, ordering, and simple in-memory test doubles.

Project layout (important folders):
- `src/main/java/forJunitInTesting` — example services, models, and a simple in-memory `UsersDatabase` implementation used by tests.
- `src/test/java/junitPerks` — JUnit examples demonstrating lifecycle annotations, ordering, and test instance behavior.
- `src/test/java/leetCodeSolutionsTests` — unit tests for LeetCode problem solutions.
- `src/main/proto` and `src/main/resources` — supporting resources and proto definitions.

Key examples and focus areas:
- Using `@TestInstance`, `@BeforeAll`, `@AfterAll`, `@BeforeEach`, `@AfterEach`.
- Ordering tests with `@TestMethodOrder` and `@Order`.
- Using simple in-memory test doubles (`UsersDatabaseMapImpl`) to avoid external dependencies.
- Writing targeted unit tests for algorithmic problems (LeetCode) to validate correctness and edge cases.

How to run tests (Windows):
1. Open a terminal in the project root (or use IntelliJ IDEA).
2. Use Gradle wrapper:
    - Run all tests:
      ```
      .\gradlew test
      ```
    - Run a specific test class:
      ```
      .\gradlew test --tests "junitPerks.UserServiceImplTest"
      ```
    - Run tests with more logging:
      ```
      .\gradlew test --info
      ```

IntelliJ IDEA:
- Import the project as a Gradle project.
- Use the IDE test runner to run individual tests or test classes from `src/test/java`.

Notes:
- Tests and examples are written in Java (project can include Kotlin/Gradle settings).
- Tests are designed to be self-contained and run quickly without external services.
- Review `src/test/java/junitPerks/UserServiceImplTest.java` for a representative example of lifecycle and ordered tests.

License:
- No license specified. Treat code as example material for learning.
