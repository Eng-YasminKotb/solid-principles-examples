# Dependency Inversion Principle (DIP)

High-level modules should not depend on low-level modules.  
Both should depend on abstractions (interfaces).

## ❌ Bad Example
- `HomeController` depends directly on `LightBulb`
- Adding a new device (Thermostat, Camera) requires modifying high-level code
- High-level code tightly coupled with low-level devices

## ✔️ Good Example
- Create `SmartDevice` interface
- Low-level devices implement `SmartDevice`:
    - `LightBulb`
    - `Thermostat`
- High-level `HomeController` depends only on `SmartDevice`
- Adding new devices requires no changes to `HomeController`

### Result
- High-level modules are independent of low-level modules
- Code is flexible, maintainable, and easy to extend
