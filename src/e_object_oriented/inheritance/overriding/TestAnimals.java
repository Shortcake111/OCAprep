package e_object_oriented.inheritance.overriding;

public class TestAnimals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat(); // Animal::eat()
        animal.eat("something"); // Animal::eat(String)
        // animal.buck(); // buck() not in Animal class

        Animal horse = new Horse();
        horse.eat(); // Horse::eat()
        horse.eat("something"); // Animal::eat(String) - inherited method
        // horse.buck(); // buck not in Animal class

        Horse realHorse =  new Horse();
        realHorse.eat(); // Horse::eat()
        realHorse.eat("something"); // Animal::eat(String) - inherited method
        realHorse.buck(); // Horse::buck()
    }
}
