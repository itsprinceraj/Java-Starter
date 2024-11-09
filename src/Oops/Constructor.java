package Oops;

public class Constructor {
    public static void main(String... args){
// Constructors are invoked when object is instantiated or created;
// Every class hs its own Default constructor, which is called with its default(class wala variable ki default value jo constructor khud set karta hai) value of variables;

//        Complex obj = new Complex();  // default
        Complex obj1 = new Complex(4,5); // parameterized;
        Complex obj = new Complex(obj1);  // copyy
        obj.printComplex();  // without creating a default constructor , it is called with its default value, 0 and 0;

        Complex result = obj1.sum(obj);
        result.printComplex();
    }
}

class Complex{
    int a,b;

//    creating a default constructor,(by default it is already present in this class but for just demonstration purpose);

//     Default Constructor;
    public Complex(){
        a = 0;
        b = 0;
        System.out.println("Default Constructor Invoked");
    }

//     parameterized Constructor
    public Complex(int a, int b){
        this.a = a;
        this.b = b;
//        System.out.println("Parameterized Constructor Invoked");
    }

//     copy constructor
    public Complex(Complex num){
        a = num.a;
        b = num.b;
    }

    void printComplex(){
        System.out.println(a+ " + "+b+"i");
    }

// We can treat Constructor as non-primitive data Type;
    Complex sum(Complex num){
        return new Complex(a+num.a ,b+num.b);
    }
}