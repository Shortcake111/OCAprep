package d_methods_and_Encapsulation;

public class SeniorCitizen extends Adult{

    public SeniorCitizen(String name, int age) {
        super(name, age);
    }

    void go(){
        address = "Galway"; // accessible because protected
    }
}
