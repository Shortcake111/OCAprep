# Object-Oriented Approach
PIE:
- Polymorphism
- Inheritance
- Encapsulation

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

## Immutability
Certain API classes are immutable by default (String, Integer, Double,...)
While it may look as thought the String object has been modified into the requested String, in reality a new String object was created (and the old one was left for garbage collection, if nothing refers to it). 

It means something can't change:
- primitives: the primitive itself
- objects: the reference or the object

Final keyword:
- primitives: makes the primitive value unchangeable
- reference: makes the reference unchangeable (if the object was mutable, it will stay that way)

Immutability checklist:
- no setters
- private, final fields
- prevent subclassing -> prevents overriding:
  - final class
  - private constructor and provide a public static factory method (e.g. createNewInstance())
- isntance fields:
  - immutable types (e.g. String)
  - mutable types e.g. StringBuilder, do NOT share references i.e. use "defensive copying" and "advanced encapsulation"

### Call-By-Value
A copy is made of something:
- primitive: the caller method cannot change the primitive value in the caller method (as it is only a copy)
- reference: the caller method can change the object that the caller method is using (as the copied reference refers to the same object)

## Polymorphism
Any Java object that can pass more than one IS-A test can be considered polymorphic. (e.g. a Car is a Vehicle)
Other than objects of type Object, all Java objects are therefore polymorphic (since they pass the IS-A test for both Object and their own type)

