package e_object_oriented.inheritance.overriding;

public class Horse extends Animal {
    @Override
    public void eat() {
        System.out.println("Horse::eat()");
    }

    public void buck(){
        System.out.println("Horse::buck()");
    }
}
