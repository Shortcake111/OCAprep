# The Java language
Java = strongly-typed language => you must specify a variable's type.

## Features and Components
### Object oriented
- Well-designed OO systems remain *testable* and *enhanceable* even if they become huge
- OO design offers a natural way to think about how the components interact.

### Encapsulation
Enables software components to hide their data from other components => *protects the data* from being updated without the components approval or knowledge.

### Memory management
Unlike e.g. C or C++,Java provides *automatic* memory management. This makes it much easier to keep track of memory usage and prevents memory leaks.

### Huge library
Has an enormous library of pre-written, well-tested and well-documented code that is easy to import.

## Important notes
### Scope
Uses "block" scope, surrounded by {}, which can be nested

### Legal identifiers (variable names)
- Must **start** with one of the following:
  - letter
  - currency character
  - underscore
- After the first character, you can use any combination of:
  - letters
  - currency characters
  - underscores
  - numbers
- No limit on number of characters
- Java keywords can't be used (e.g. int for=2;) [Docs keywords](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)
- Case-sensitive (e.g. foo and FOO are two different identifiers)

#### Legal examples
```java
int _a;
int €6;
int £3;
int $h_8;
int _;
int $c;
int _____c_w;
int _$;
int this_is_a_very_long_name_for_an_identifier;
```

#### Illegal examples
```java
int :b;
int -d;
int e#;
int .f;
int 7g;
```