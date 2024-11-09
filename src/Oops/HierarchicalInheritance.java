package Oops;

public class HierarchicalInheritance {
    public static void main(String[] args) {

//         take instance of both classes;
        Truck truck = new Truck();
        Bike bike =  new Bike();

        bike.vroom();
        bike.printVehicles();  // access parents behaviour;
        truck.printVehicles();
        truck.popo();
    }
}




// Here Vehicle Class has two child which will inherits the properties of their parents;


// create a class vehicle
class Vehicle{
  int vehicleCount = 2;
  void printVehicles(){
      System.out.println( "I have itna num. of Vehicle: "+vehicleCount);
  }
}



// create a Truck class which extends from vehicle
class Truck extends Vehicle{
  String slogan = "buri nazar wala tera muh kala";
  void popo(){
      System.out.println("pooo poooo");
  }
}


//create a bike class which extends from vehicle
class Bike extends Vehicle{
   String type = "Sports bike";
   void vroom(){
       System.out.println("Vroom Vroom");
   }
}









