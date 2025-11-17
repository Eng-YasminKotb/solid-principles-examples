import java.security.PublicKey;

public class PayPalPayment implements PaymentMethod{

    @Override
    public void pay(double amount){
        System.out.println("Paying " + amount + " with PayPal");
    }
}
