package forJunitInTesting.service;


import forJunitInTesting.model.User;

public interface EmailVerificationService {
    void scheduleEmailConfirmation(User user);
}
