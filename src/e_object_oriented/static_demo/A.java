package e_object_oriented.static_demo;

public class A {
    static { // 1a. static block
        System.out.println("static A1");
    }

    { // 2a. instance block
        System.out.println("instance A1");
    }

    public A(int i) { // 3. constructor
        System.out.println(i + "\n");
    }

    static { // 1b. static block
        System.out.println("static A2");
    }

    { // 2b. instance block
        System.out.println("instance A2");
    }
}
