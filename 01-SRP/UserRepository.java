public class UserRepository {
    public void save(User user) {
        System.out.println("Saving user to DB: " + user.getName());
    }
}
