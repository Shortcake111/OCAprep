package e_object_oriented.static_demo;

public class TestAAndB {
    public static void main(String[] args) {
        B b = new B();
        A a = new A(3);
    }

    /*
     * line 1:
     * static B
     * static A1
     * static A2
     * instance A1
     * instance A2
     * 1
     *
     * instance A1
     * instance A2
     * 4
     *
     * instance A1
     * instance A2
     * 2
     *
     * instance B
     *
     * line 2:
     * instance A1
     * instance A2
     * 3
     */
}
