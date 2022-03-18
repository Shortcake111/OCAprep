package e_object_oriented.inheritance.overriding;

import java.io.IOException;

public class Cow extends Animal {
    // private void eat(){} // access modifier can't be weaker
    // public void eat() throws IOException{} // can't throw new or broader exceptions
    // public void eat(int numberOfSlices){} // an overload, not an override
    // public String eat(){} // return type isn't the same

    @Override
    public Cow drink(){ // covariant return types (public Animal drink()) -> ok
        return new Cow();
    }

}
