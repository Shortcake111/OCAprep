package e_object_oriented.immutability;

import java.util.ArrayList;

final class ImmutableDepartment { // cannot subclass this class and all methods are final
    private final String name, address; // String is immutable
    private final int numEployees;
    private final ArrayList<String> employees; // mutable

    // factory method to create a Department
    public static ImmutableDepartment createNewInstance(String name, String address, int numEployees, ArrayList<String> employees){
        return new ImmutableDepartment(name, address, numEployees, employees);
    }

    // private constructor -> cannot subclass this class
    // cannot be invoked from a subclass (hidden)
    private ImmutableDepartment(String name, String address, int numEployees, ArrayList<String> employees) {
        this.name = name;
        this.address = address;
        this.numEployees = numEployees;
        // instead of this.employees = employees;, which breaks encapsulation ->
        // defensive copying:
        this.employees = new ArrayList<>(employees); // create a new list
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumEployees() {
        return numEployees;
    }

    public ArrayList<String> getEmployees() {
        return new ArrayList<>(employees); // return a new object, so the original can't be modified
    }

    @Override
    public String toString() {
        return "ImmutableDepartment{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", numEployees=" + numEployees +
                ", employees=" + employees +
                '}';
    }
}
