package b_data_types;

public class Casting {
    public static void main(String[] args) {
        char c = 'a'; // chars in single quotes
        int i1 = c; // automatic widening, char into int
        float f = 23; // int into float
        double d = 2.3f; // float into double
        float f1 = 1L; // long promoted to float

        int i2 = (int) 3.3; // double cast to int
        byte b1 = (byte) 120; // cast not actually needed
        byte b2 = 120; // compiler "knows" int literal is in range
        // float f3 = 3.45;
        float f2 = (float) 3.45; //double to float

        char c1 = (short) 98; // 'b'
        System.out.println(c1); // b
        short s12 = 'a'; // 97 is in range of short
        char e = 'a'; // chars in single quotes
        // short s2 = c; // does not work with a variables (unless c is a compile-time constant

        final char c2 = 'a'; // c2 is "final" i.e. a compile-time constant
        short s3 = c2; // compiler cna plug in the value now as it will never be changing

        wrappers();
    }

    public static void wrappers(){
        // parseXXX(String)
        int i2 = Integer.parseInt("33"); // parseInt returns an int
        double d = Double.parseDouble("2.3");
        float f = Float.parseFloat("4.4");

        // value() preferred to using constructors (memory)
        Integer iw = Integer.valueOf(2); // better than using constructor
        Integer iw2 = Integer.valueOf("22"); // overloaded
        Integer iw3 = Integer.valueOf("F", 16); // "F" treated as hex (base 16)
        System.out.println(iw3); // 15

        // boxing/unboxing
        Integer x = 3; // auto-boxing
        int i  = Integer.valueOf(3); // auto-boxing
    }
}
