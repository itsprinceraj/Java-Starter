package Oops.MultiLevelInheritance;

public class ChildClass {
    public static void main(String[] args) {

//super keyword refer or access the properties of parent class;
Books book = new Books();
//book.showBooks();

    }
}



// create a child class
class Books extends Library{  // cannot inherit  a class declared with final keyword;

// It has access of only its parent class which is Library Class;
int numOfBooks = 500;
final void showBooks(){
//    super.callName();
    System.out.println("I have "+ numOfBooks + " Books");
    }

    Books(){
    //super(10); // when you give parameter to child super keyword , then you can access the parameterized constructor of parent class;
//        super.callName();
//        System.out.println("This is Books");
    }

}