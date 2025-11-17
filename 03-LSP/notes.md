# Liskov Substitution Principle (LSP)

**Subclasses must be replaceable with their parent class without breaking the program.**

---

## ❌ Bad Example  
`Penguin` extends `Bird` and overrides `fly()` with an exception.  
Replacing `Bird` with `Penguin` causes runtime errors → violates LSP.

---

## ✅ Good Example  
Separate birds into:
- `Bird` (common behavior)
- `FlyingBird` (birds that can fly)

Classes:
- `Sparrow` → extends `FlyingBird`
- `Penguin` → extends `Bird`

Now each subclass behaves correctly without breaking the original contract.
