package Oops;


// This is Anonymous class;
public class AnonymousClass {

//     you want to create a child class of OuterClass;
//     if you want to create a class which you want to use only 1 time then you can create anonymous class (you cannot create multiple instance like in normal classes ;

    // ex: OuterClass outer2 =  new OuterClass(){};   it cannot be done in case of anonymous;



    public static void main(String[] args) {
        OuterClass outer = new OuterClass(){
//         now this is an anonymous child class which inherits from OuterClass;
//        void doIt(){
//            System.out.println("yeah braaa;");
//        }
        };


//     implementing anonymous interface;
        SuperClass sc = new SuperClass() {  // it can also be created only 1 time, you cannot create multiple instance of this;
            @Override
            public void superMethod() {
                System.out.println("superMethod");
            }
        };

//         calling methods;
        outer.doIt();
        sc.superMethod();
    }
}

class OuterClass{
    void doIt(){
        System.out.println("yes, Do it;");
    }

}



// you can also implement anonymous interfaces from an interface;

interface SuperClass{
    public void superMethod();
}


