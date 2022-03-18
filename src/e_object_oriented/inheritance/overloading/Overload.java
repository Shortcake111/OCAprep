package e_object_oriented.inheritance.overloading;

import java.io.IOException;

public class Overload {
    public void m(int i, String s, float f){} // int, String, float
    public void m(int i, String s){} // int, String
    public int m(int i, float f){ return 1; } // int, float
    public void m(float f, String s) throws IOException {} // float, String
}
