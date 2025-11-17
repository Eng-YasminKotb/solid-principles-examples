public class PaymentService_GoodExample {
    private final PaymentMethod paymentMethod;

    public PaymentService_GoodExample(PaymentMethod paymentMethod){
        this.paymentMethod= paymentMethod;
    }
    public void processPayment(double amount){
        paymentMethod.pay(amount);
    }
}
