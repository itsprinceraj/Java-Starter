package Oops;

public class Interfaces {
    public static void main(String[] args) {

        Male ml = new Male();
//        ml.washHands();
//        ml.canWalk();
//        System.out.println(Male.num);
        Female fl = new Female();
//        fl.canDance();
    }
}


// Interfaces in java is similar to abstract class;
// instead of using extend, implements keyword is used to inherit a property of parent class to a subclass;

interface Animals{
//by default the functions inside the interface is public abstract;
   public abstract void canWalk();

//by default variable in interface is (public static final).
    public static final int num = 5;  // it cannot be changed in the future , because it is abstract so that it is sharing everything so other class may change the value, so it came with public static final;

}

interface Human{
    public abstract void washHands();

//  if you parent interface is inherited by 1000s of child class, and you want to one more method to Parent interface.
// This is so difficult cause to override all the child class that implements parent interface;4
//    so to avoid this problem, default method is introduced;

    default void canDance(){
//   any child class can access this , so we do not have to define its body in each child class;
        System.out.println("dancing");
    }

}

// In java multiple inheritance is not supported;
// it means a single child cannot have multiple parents;
//But by using interfaces , we can achieve multiple inheritance in java;
// cause a single child class can implement multiple interfaces;


// Implementing child class
class Male implements Animals,Human{
    // a child interface implemented class must have to define body of each method which is defined in its parent interfaces;

    public void washHands(){
        System.out.println("Washing hands");
    }

    public void canWalk(){
        System.out.println("Walking");
    }

}

class Female implements Human{
    public void washHands(){
        System.out.println("Washing my hands");
    }
}

