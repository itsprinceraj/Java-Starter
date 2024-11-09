package Oops.MultiLevelInheritance;

public class ParentClass {
    public static void main(String[] args) {

//this keyword refers to the properties of current class or current object;
        Library lib =  new Library();
//      lib.noOfShelf = 500; // cannot change a variable declared with final;
        System.out.println(lib.noOfShelf);
//        lib.callName();
//        lib.callName(50);


    }
}



//Create parent class;
//final class Library;
 class Library{

     int noOfShelf = 1000;
//    final int noOfShelf = 5000;
    String books[] = {"Literature" , "Poem", "Nobel"};
    void callName(){
//        System.out.println(this);
//        System.out.println("I am Library");
        System.out.println(noOfShelf);
    }


    Library(){
//        System.out.println("this is library");
    }

    Library(int num){
        this.noOfShelf = num;
        System.out.println(noOfShelf);
    }


    void callName(int num) {
        this.noOfShelf = num;
        System.out.println(num);
    }

}
