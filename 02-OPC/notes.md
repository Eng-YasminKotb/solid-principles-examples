# Open/Closed Principle (OCP)

**Classes should be open for extension, but closed for modification.**

---

## ❌ Bad Example  
`PaymentService` uses `if/else` to check the payment method (Credit, PayPal, Cash).  
Adding a new payment method requires modifying the same class → violates OCP.

---

## ✅ Good Example  
Use a `PaymentMethod` interface and create a separate class for each payment type.

- `CreditCardPayment`
- `PayPalPayment`
- `CashPayment`

`PaymentService_GoodExample` depends only on the interface and never changes.  
To add a new payment method → simply create a new class.

This follows OCP and makes the system extensible and maintainable.
