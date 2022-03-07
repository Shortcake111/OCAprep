# Object-Oriented Approach
## this reference
Refers to the object instance which invoked this instance method.
It's available to instance methods only (not to static methods).
Useful when a method parameter uses the same identifier as an instance variable -> you can use this to distinguish the instance member from the parameter. 

The compiler secretly passes the 'this' reference in as the first argument of any instance method.
