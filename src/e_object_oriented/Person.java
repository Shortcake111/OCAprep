package e_object_oriented;

public class Person {
    private String name; // instance var
    private int age; // instance var
    private static int count; // class var

    // constructor = method with same name as the class and no return type
    public Person() {
        Person.count++;
    }

    public Person(/* secret var: this, */ String name, int age) { // overloaded constructor
        this.name = name; // this refers to the instance var, without 'this' the local scope is scanned
        this.age = age;
        Person.count++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }
}
