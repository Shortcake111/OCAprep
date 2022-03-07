package a_basics;

public class Scope {
    // class scope variables
    static int count;
    /* ! exception for static: static methods can access static methods only
    (but static variables can be accessed from non-static methods) */
    int x;

    public static void main(String[] args) {
        //local variables = method parameters + variables within the method
        int a = 1;
        a++;

        { //start of code block
            a++;
            int b = 0;
            b++;
            {
                count++;
                //x++; // variable not static;
                a++;
                b++;
            }
        } //end of code block
        //b++; // out of scope;
    }

    public static void method1() {
        count++;
        //x++; // variable not static;
        //a++; // out of scope;
        //b++; // out of scope;
    }

    public void method2() {
        count++;
        x++;
        //a++; // out of scope;
        //b++; // out of scope;
    }
}
