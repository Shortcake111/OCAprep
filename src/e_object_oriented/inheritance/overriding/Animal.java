package e_object_oriented.inheritance.overriding;

public class Animal {
    public void eat(){
        System.out.println("Animal::eat()");
    }

    public void eat(String s){
        System.out.println("Annimal::eat(String)");
    }

    public Animal drink(){
        return new Animal();
    }
}
