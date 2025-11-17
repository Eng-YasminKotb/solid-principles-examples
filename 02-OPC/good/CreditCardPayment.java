public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount){
        System.out.println("Paying " + amount + " with Credit Card");
    }
}
