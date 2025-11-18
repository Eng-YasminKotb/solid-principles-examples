package good_Example;

public class EmailNotification implements EmailNotifier{
    @Override
    public void sendEmail(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}
