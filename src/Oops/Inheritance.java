package Oops;


// This is Simple Inheritance; called single level or single inheritance;
public class Inheritance {
    public static void main(String[] args) {
// In Inheritance, child class inherits all the properties and behaviours from its parents and also have its own properties and behaviours;

// For inheriting the properties we use extends keyword;

//         create an instance or object of Cat class;
        Cat cat = new Cat();
        System.out.println(cat.type);  // type variable is of Animal class but Cat instance has also access of it;
//        cat.meow();
        System.out.println(cat.name);  // if both parent and child have same properties then it will be overridden by child class;

    }
}


// here we will create a parent class and a child class;

// parent class;
class Animal{
    String type = "Mamals";
    String name = "Cat";
    int animalCount = 5;
}

// child class;
class Cat extends Animal{
    // now class cat has access to all of its parents properties;

// for ex: If we create an object with the instance of Cat class then the properties of animal class will be accessible in that instance;

//  well Cat class can also have its own properties;
    String name = "kitty";
    String breed = "persian cat";
    void meow(){
        System.out.println("meow meow");
    }
}

