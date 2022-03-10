package e_object_oriented.immutability;

import e_object_oriented.Person;

public final class ImmutablePerson {
    // instance fields are final and private -> can only be assigned once
    private final String name; // blank final
    private final int age; // blank final

    public static void main(String[] args) { // params are final: don't want to accidentally change them
        Person p1 = new Person("Joe Bloggs", 23);
        System.out.println(p1);

        Person p2 = new Person("Mary Bloggs", 24);
        System.out.println(p2);
    }

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // no setter methods -> state cannot be changed after construction
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
