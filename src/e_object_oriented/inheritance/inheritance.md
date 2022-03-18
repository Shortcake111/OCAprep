# Inheritance
## Overriding
To override a method, the following must match exactly:
- The argument list (otherwise it becomes overloading)
- The return type (or a subtype of it)
  The access level cannot be more restrictive than that of the superclass method either.

If the parent class method is private, static or final, the method cannot be overridden. The method must be inherited first before it can be overridden.

## Overloading
Overloaded methods MUST have a different argument list. The return type, access modifier and exceptions CAN change.
An overloaded method can be overloaded in the same type or a subtype.

## Comparing
### instanceof
Determines if a reference is referring to an object of a certain type (class or interface).

### equals(Object)
Checks if the references refer to the same object in memory (==).
You can override this method to provide custom behavior.
