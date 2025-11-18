# Interface Segregation Principle (ISP)

A class should not be forced to depend on methods it does not use.

## ❌ Bad Example
`NotificationService` contains unrelated actions:
- sendEmail
- sendSMS
- sendPush

Classes like `EmailNotification` and `SMSNotification` are forced  
to override methods they do not need → leading to thrown exceptions.

This violates ISP because:
- the interface is too large
- classes depend on unused methods
- design becomes harder to maintain

---

## ✔️ Good Example
Interfaces are split by notification type:
- `EmailNotifier`
- `SMSNotifier`
- `PushNotifier`

Classes implement only what they support:
- `EmailNotification` → email only  
- `SMSNotification` → SMS only  
- `PushNotification` → push only  
- `MultiChannelNotification` → supports all three

### Result:
- clean code  
- no unused methods  
- each class depends only on what it actually needs  
- fully respects ISP  
