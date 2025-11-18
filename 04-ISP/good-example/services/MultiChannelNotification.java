package good_Example;

public class MultiChannelNotification implements
        EmailNotifier, SMSNotifier, PushNotifier {
    @Override
    public void sendEmail(String msg) {
        System.out.println("Multi: Email -> " + msg);
    }

    @Override
    public void sendPush(String msg) {
        System.out.println("Multi: Push -> " + msg);

    }

    @Override
    public void sendSMS(String msg) {
        System.out.println("Multi: SMS -> " + msg);
    }
}
