package Oops.MultiLevelInheritance;

public class Child2Class {
    public static void main(String[] args) {
        Shelf shelf = new Shelf();
        shelf.showBooks();
////        shelf.callName();
//        for(String book:shelf.books){
//            System.out.println(book+" ");
//        }
//        System.out.println(shelf.noOfShelf);
//        System.out.println(shelf.numOfBooks);
    }
}



// create Second child
class Shelf extends Books{
    int shelf ;

//    public Shelf(int a){
//        this.shelf = a;
//    }
//this class has access to the properties of its parent class as well as its Grand parent Classs;

    // i.e: shelf will inherit the properties of Books Class and Library class also;


//     this concept is called method overriding;

//method of parent class is modified in child class with same name and parameter but different body;

//void showBooks(){   // cannot override a method in child class declared with final keyword in parent class;
//    System.out.println(shelf);
//}


}