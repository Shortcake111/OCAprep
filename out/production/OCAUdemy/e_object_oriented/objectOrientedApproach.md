# Object-Oriented Approach
## this reference
Refers to the object instance which invoked this instance method.
It's available to instance methods only (not to static methods).
Useful when a method parameter uses the same identifier as an instance variable -> you can use this to distinguish the instance member from the parameter. 

The compiler secretly passes the 'this' reference in as the first argument of any instance method.

## Object initialisation
1. The first time an object of a type is created OR the first time a static field or method of that class is accessed, the JVM locates that class.
2. As the class is loaded, all of its static initialisers are run (in the same order of the code appears). This happens only once, when the class is loaded for the first time.
3. When you create a new instance of the class, space is allocated on th eheap and it is wiped to zero. This sets all the primitives in that object to their default values (i.e. 0 or 0.0 for numbers, false for boolean and null for references).
4. All the non-static (instance) initialisation now takes place e.g. instance variables and instance blocks. Also in the same order as the code appears.
5. Constructor(s) are executed.

Note: inheritance: SIC -> Statics, Instance, Constructors 
