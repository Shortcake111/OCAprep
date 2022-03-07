package d_methods_and_Encapsulation;

public class AccessModifiers {
    public static void main(String[] args) {
        Adult john = new Adult("John", 12);
        // john.name = "jj"; // can't: name is private in Adult
        john.setName("jj");
        System.out.println("Is 17 ok? " + john.isAgeOK(17));

        int age = 20;
        Adult benny = new Adult("Benny", age);
        change(benny, age);
        System.out.println(benny.getName() + " " + age); // Michael 20
    }

    public static void change(Adult adult, int age){
        age = 90;
        adult.setName("Michael");
    }
}
