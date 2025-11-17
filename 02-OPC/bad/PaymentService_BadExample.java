public class PaymentService_BadExample {

    public void pay(String method, double amount) {
        if (method.equals("credit")) {
            System.out.println("Paying " + amount + " with Credit Card");
        } else if (method.equals("paypal")) {
            System.out.println("Paying " + amount + " with PayPal");
        } else if (method.equals("cash")) {
            System.out.println("Paying " + amount + " with Cash");
        }
        else{
            throw new IllegalStateException("Unsupported payment method");
        }
    }
}
