# Single Responsibility Principle (SRP)

**A class should have only one reason to change.**

---

## ❌ Bad Example  
`UserService` is responsible for:
- Saving the user  
- Sending a welcome email  
- Handling the entire registration process  

This makes the class harder to maintain and test.

---

## ✅ Good Example  
Responsibilities are separated into clear, independent classes:

- **UserRepository** → Handles saving user data  
- **EmailService** → Handles sending welcome emails  
- **UserService_GoodExample** → Only coordinates the registration workflow  

This makes the code cleaner, more testable, and easier to extend.
