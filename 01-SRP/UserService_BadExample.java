public class UserService_BadExample {

    public void registerUser(User user){

        System.out.println("User " + user.getName() +" is saved successfully!");


        System.out.println("Sending welcome email to " + user.getEmail());
    }
}
