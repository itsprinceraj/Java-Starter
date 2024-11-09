package Oops;

public class OverLoading {
    public static void main(String... args){

//Method OverLoading: By using this concept, one can create multiple method with the same name but with different parameters;

        Sum obj = new Sum();
        obj.sum(10,15,2);
    }
}

class Sum{ // method overloading is a type of Static of compile time polymorphism;

// here we have created multiple methods with same name but having different parameters;
// you have to either change the number of parameters or type of parameter, but only changing the return type, that is not method overLoading;
    void sum(){
        System.out.println(5+5);
    }

    void sum(int a, int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println((a+b)*c);
    }
}
