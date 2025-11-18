package bad_Example;

public class EmailNotification implements NotificationSystem {


    @Override
    public void sendSMS(String msg) {
        throw new UnsupportedOperationException("Email cannot send SMS!");
    }

    @Override
    public void sendPush(String msg) {
        throw new UnsupportedOperationException("Email cannot send push!");
    }

    @Override
    public void sendEmail(String msg) {
        System.out.println("Sending Email: " + msg);
    }
}
