package e_object_oriented.immutability;

import java.util.ArrayList;

public class TestImmutableDepartment {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ann");
        employees.add("Liam");

        ImmutableDepartment dept = ImmutableDepartment.createNewInstance("Argos", "Athlone", 2, employees);

        System.out.println("Created: " + dept);

        String name = dept.getName();
        String address = dept.getAddress();
        int numEmployees = dept.getNumEployees();
        employees = dept.getEmployees();

        System.out.println("Retrieved: " + name + " " + address + " " + numEmployees + " " + employees);
        // Retrieved: Argos Athlone 2 [Ann, Liam]

        // change what I got back - any affect on the "dept" immutable object?
        name = "Boots"; // Strings are immutable, so new objects are created in the bg -> OK
        address = "Galway";
        numEmployees = 3; // simple primitive: value is just copied back
        employees.add("Tom"); // since we got a copy back, we are changing the copy

        // Any change?: Department{name=Argos, address=Athlone, numEployees=2, employees=[Ann, Liam]}
        System.out.println("Any change?: " + dept);
    }
}
