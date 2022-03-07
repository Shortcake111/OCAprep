package e_object_oriented;

public class TestPerson {
    public static void main(String[] args) {
        Person sean = new Person("Seán Kennedy", 43); // using overloaded constructor
        Person mary = new Person();

        // mary.name = "Mary"; // encapsulation: name is private
        mary.setName("Mary");
        mary.setAge(25);
        System.out.println(Person.getCount()); // 2

        // System.out.println(name); doesn't work

        String name = "Paul"; // local var
        System.out.println(name);
    }
}
