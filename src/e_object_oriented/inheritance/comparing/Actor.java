package e_object_oriented.inheritance.comparing;

public class Actor {
    private String name;
    private int age;

    public static void main(String[] args) {
        Actor actor1 = new Actor("John Bloggs", 25);
        Actor actor2 = new Actor("John Bloggs", 25);
        // ==? (are the references referring to the same object?)
        System.out.println(actor1 == actor2); // false (different objects)

        // Object::equals() does the same as == by default
        System.out.println(actor1.equals(actor2)); // false
    }

    public Actor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
