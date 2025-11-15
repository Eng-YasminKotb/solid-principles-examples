public class UserService_GoodExample {
    private final UserRepository userRepository;
    private final EmailService emailService;

    public UserService_GoodExample(UserRepository userRepository, EmailService emailService) {
        this.userRepository = userRepository;
        this.emailService = emailService;
    }

    public void registerUser(User user) {
        userRepository.save(user);
        emailService.sendWelcomeEmail(user);
    }
}
