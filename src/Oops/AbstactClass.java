package Oops;

public class AbstactClass {

    public static void main(String[] args) {
//        Automobiles atm = new Automobiles();
// instance cannot be taken of abstract class;

        Scooter sctr = new Scooter();
        sctr.run();
        sctr.brake();
        sctr.accelerate();
    }
}



// Abstract class is a concept in which is abstract;
// You cannot create an instance of abstract class, and it can contain both regular and abstract method;

// but the body of the abstract methods cannot be described in the abstract class;
// you can access the abstract class using instance of its subclass , if the subclass is also an abstract class then again the definition of its abstract method would be in its subclass;


// creating an abstract class;
abstract class Automobiles{

//     it can contain both regular and abstract methods;
    void run(){
        System.out.println("running");
    }

    abstract void brake();

    abstract void accelerate();
}

class Scooter extends Automobiles{
    void brake(){
        System.out.println("Braking");
    }

    void accelerate(){
        System.out.println("Accelerating");
    }

    void run(){
        System.out.println("this is run method");
    }
}


