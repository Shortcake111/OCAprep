package d_methods_and_Encapsulation;

public class Person {
    private String name; // initialized to 'null'
    private static int numberOfPeople; // initialized to 0

    public Person(String name) {
        this.name = name;
        numberOfPeople++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfPeople() {
        return numberOfPeople;
    }
}