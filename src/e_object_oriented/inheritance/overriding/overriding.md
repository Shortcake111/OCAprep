# Overriding
To override a method, the following must match exactly:
- The argument list (otherwise it becomes overloading)
- The return type (or a subtype of it)
The access level cannot be more restrictive than that of the superclass method either. 

If the parent class method is private, static or final, the method cannot be overridden. The method must be inherited first before it can be overridden.
