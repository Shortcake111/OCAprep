# Methods
They have a signature which consists of the method name and parameter types and their order. The return type is not part  of this.

Java uses Call-By-Value: a copy of the argument is passed to the method:
- **primitive**: the called method **cannot** change the primitive value in the caller method
- **reference**: the called method **can** change the object (state) that the caller method is looking at

