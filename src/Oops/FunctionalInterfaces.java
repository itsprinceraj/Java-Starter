package Oops;

public class FunctionalInterfaces {
//     functional interface are the interface which contains only one abstract method;
public static void main(String[] args) {

//     lambda expressions works on only Functional Interfaces;
//     it says that, you have only one interface and 1 method so why could i even tell you the name of interface;

    newInterface newIf = () -> {
        System.out.println("steps");
    };

    newIf.steps();
}

}


// create an functional interface
@FunctionalInterface
interface newInterface{
    void steps();  // it can consist only 1 abstract method;
}