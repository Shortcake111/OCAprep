# Methods and Encapsulation
## Access Modifiers
4 access modifiers (from most to least restrictive)
1. private: accessible only within the class
2. package-private: accessible within the package
3. protected: accessible within the package and for childeren of the class outside of the package
4. public: available everywhere

## Methods
Method signature = name of method + parameter types and their order
The access modifier parameter, parameter names and the return type are NOT part of the method signature. 
E.g.: public double getMyFunds(String bankName) -> method signature: getMyFunds(String bankName)
public static int minimum(int x, int y) -> method signature: minimum(int x, int y)
