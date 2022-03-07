package d_methods_and_Encapsulation;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("John");
        System.out.println("new person: " + person1.getName() + " total number of people: " + Person.getNumberOfPeople());
        Person person2 = new Person("Mary");
        System.out.println("new person: " + person2.getName() + " total number of people: " + Person.getNumberOfPeople());
    }
}
