package Oops;

public class MainClasses {
    public static void main(String[] args){

// You can make objects of the existing class inside main function and access it;
        Dog d1 = new Dog(); // 'd1' object is created;
// By using this object, i can access the properties that exist in dog class;

        d1.name = "Jack";
        d1.age = 12;
        d1.color = "Golden";
        d1.walk(); //prints 'Jack Walks';

//        similarly we can create an object for car class and use that object to access the properties and behaviour of that particular class;
        Car c1 = new Car();
        c1.name = "Fortuner";
        c1.brand = "Toyota";
        c1.price =  50_00_00_0;
        c1.horn();
        System.out.println(c1.price);
    }
}

// we can make multiple classes inside a file, but there can be only 1 public class;

// Name of the class must starts With capital Letters;
class Dog{
    String name ;
    int age;
    String color;
    void walk(){
        System.out.println(name + " Walks");
    }
}

class Car{
    String name;
    int price;
    String brand;
    void horn(){
        System.out.println( brand + "'s " + name + " blows horn");
    }
}
