class Car {
    String name;
    String color ;
    int price ;

//     create a constructor with or without argument by using the class car
    Car(){
        System.out.println("inside default constructor");
        name = "Innova";
        color = "White";
        price = 900000;
    }

//     constructor do not have return value;
//    Car(String carName , String carColor, int carprice){
//        System.out.println("inside argument constructor");
//        name = carName;
//        color = carColor;
//        price = carprice;
//
//    }

//     define methods also
    void locked(){
        System.out.println("car is now locked");
    }

    void unLocked(){
        System.out.println("car is now unlocked");
    }
}

// for accessing the properties of clas we must need to create object
class Main {
    public static void main(String... args){
//        Car c2 = new Car(carName: "innova", carColor: "Blue");
        Car c1 = new Car();  // c1 object is ready
//         you can create many objects from the same class

//    now using the c1 object , we can easily access the properties of the car classs
        System.out.println(c1.name);
        System.out.println(c1.color);
        System.out.println(c1.price = 30000); // we can change the value dynamically
        c1.locked();
        c1.unLocked();

//         now lets access it using costructor .
        // constructor is a special function , that is invoked when an object is instantiated;

    }

}
