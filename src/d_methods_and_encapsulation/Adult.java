package d_methods_and_encapsulation;

public class Adult {
    private String name;
    private int age;
    protected String address;

    public Adult(String name, int age) {
        if (!isAgeOK(age)) throw new IllegalArgumentException();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!isAgeOK(age)) throw new IllegalArgumentException();
        this.age = age;
    }

    boolean isAgeOK(int age){
        return age >= 18;
    }
}
