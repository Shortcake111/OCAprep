package e_object_oriented.static_demo;

public class B {
    static { // 1a. static block
        System.out.println("static B");
    }

    static A s1 = new A(1); // 1b. static var

    A a = new A(2); // 2a. instance var

    static A s2 = new A(4); // 1c. static var

    { // 2b. instance block
        System.out.println("instance B");
    }
}
