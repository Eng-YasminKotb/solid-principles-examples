package good_Example;

public class PushNotification implements PushNotifier{
    @Override
    public void sendPush(String msg) {
        System.out.println("Sending Push Notification: " + msg);
    }
}
