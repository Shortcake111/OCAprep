package e_object_oriented.inheritance.comparing;

public class Singer {
    private String name;
    private int age;

    public static void main(String[] args) {
        Singer singer1 = new Singer("John Bloggs", 25);
        Singer singer2 = new Singer("John Bloggs", 25);
        // ==? (are the references referring to the same object?)
        System.out.println(singer1 == singer2); // false (different objects)

        // Object::equals() does the same as == by default
        System.out.println(singer1.equals(singer2)); // false
    }

    public Singer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Singer){
            // now it is safe to downcast
            Singer singer = (Singer) obj;
            if (this.getAge() == singer.getAge() && this.getName().equals(singer.getName())){
                return true;
            }
        }
        return false;
    }
}
