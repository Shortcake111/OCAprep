package b_data_types;


public class Operator {
    public static void main(String[] args) {
        prefixAndPostfix();
        System.out.println();
        unaryOperators();
        System.out.println();
        arithmeticOperators();
        System.out.println();
        stringConcatenation();
        System.out.println();
        relationalOperators();
        System.out.println();
        logicalOperators();
        System.out.println();
        ternaryOperators();
        System.out.println();
        compoundAssignmentOperators();
    }

    private static void prefixAndPostfix(){
        System.out.println("---Prefix and postfix:");
        int x = 3, y = 4;
        x++; // 4
        --y; // 3
        System.out.println(x + " " + y); // 4 3
        System.out.println(x++ + " " + --y); // 4 2
        System.out.println(x + " " + y); // 5 2
    }

    private static void unaryOperators(){
        System.out.println("---Unary operators:");
        //unary operators (one operand)
        int x = +6;
        int y = -x;
        System.out.println(x + " " + y); // 6 -6

        int z = (int) 3.45;
        System.out.println(z); // 3

        boolean b = true;
        System.out.println(!b); //false
    }

    private static void arithmeticOperators(){
        System.out.println("---Arithmetic operators:");
        int x = 10, y = 3;
        int div = x/y; // integer division truncates
        int mod = x%y; // keep remainder only
        System.out.println(div + " " + mod); // 3 1
        System.out.println(0 % 3); // 0

        int res = 3 + 2 * 4;
        System.out.println(res); // 11
        res = (3 + 2) * 4;
        System.out.println(res); // 20
        res = 6 + 4 - 2;
        System.out.println(res); // 8
        res = 10 / 4 * 6;
        System.out.println(res); // 12

        //any maths operation involving int-types or smaller, results in an int
        byte b1 = 2, b2 = 3; // compiler "knows" that the int literals are in range => ok
        // byte b3 = 128; // 128 is not in range (-128..+127)
        // byte b4 = b1 + b2; // must cast int to byte
        byte b6 = (byte) (b1 + b2); // brackets needed to sum up before casting
    }

    private static void stringConcatenation(){
        System.out.println("---String Concatenation:");
        int a = 3, b = 2;
        int res = a + b;
        System.out.println(res); // 5
        String s = "abc";
        String s1 = a + s;
        String s2 = s + a;
        System.out.println(s1 + " " + s2); // 3abc abc3

        System.out.println("Output is " + a + b); // Output is 32
        System.out.println("Output is " + (a + b)); // Output is 5
    }

    private static void relationalOperators(){
        System.out.println("---Relational Operators:");
        System.out.println(5.0 == 5); // true
        System.out.println(5.1 == 5); // false
        System.out.println(5.0 == 5L); // true

        int x = 8, y = 9;
        System.out.println(x == y); // false
        System.out.println(x != y); // true
    }

    private static void logicalOperators(){
        System.out.println("---Logical Operators");
        // logical AND => short-circuits
        boolean b1 = false, b2 = true;
        boolean res = b1 && (b2 = false); // F &&
        System.out.println(b1 + " " + b2 + " " + res); // false true false

        // logical OR => short-circuits
        boolean b3 = false, b4 = true;
        boolean res2 = b4 || (b3=true); // T ||
        System.out.println(b3 + " " + b4 + " " + res2); // false true true

        // bitwise AND => does not short-circuit
        boolean b5 = false, b6 = true;
        boolean res3 = b5 & (b6 = false); // F & F
        System.out.println(b5 + " " + b6 + " " + res3); // false false false

        // bitwise OR => does not short-circuit
        boolean b7 = false, b8 = true;
        boolean res4 = b8 | (b7=true); // T ||
        System.out.println(b7 + " " + b8 + " " + res4); // true true true

        // bitwise XOR = one of the other, but not both => does not short-circuit
        boolean b9 = (5 > 1) ^ (10 < 20); // T ^ T == F
        boolean b10 = (5 > 10) ^ (10 < 20); // F ^ T == T
        System.out.println(b9 + " " + b10); // false true
    }

    private static void ternaryOperators(){
        System.out.println("---Ternary Operators");
        int numberOfPets = 3;
        String status = (numberOfPets < 4) ? "Pet limit not exceeded" : "Too many pets";
        System.out.println(status); // "Pet limit not exceeded"

        int sizeOfYard = 7;
        numberOfPets = 6;
        // nested
        status = (numberOfPets < 4) ? "Pet count OK" : (sizeOfYard > 8) ? "Pet limit on edge" : "Too many pets";
        System.out.println(status); // "Too many pets "
    }

    private static void compoundAssignmentOperators(){
        System.out.println("---Compound Assignment Operators:");
        byte b1 = 3;
        int i1 = 4;
        // b1 = b1 + i1; // byte = int ERROR!
        b1 += i1; // no error => b1 = (byte) (b1 + i1)

        int x = 2;
        /* '*' has higher precedence than '+'
        The expression on the RHS is always placed in parentheses
        and therefore the expression evaluates as x = x * (RHS) */
        x *= 2 + 5;
        /* x = (x*2) + 5 == 9 OR x = x * (2 + 5) == 14? */
        System.out.println(x); //14

        int k = 1;
        k += (k=4) * (k + 2); //k = 1 + ((k=4) * (k+2)) => k = 1 + (4*6)
        System.out.println(k); //25
    }
}
