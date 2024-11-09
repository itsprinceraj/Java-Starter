import java.util.Scanner;

public class ExceptionHandling {
    // exception handling is a crucial part of programming, it is of two types:
//1. Run Time Exception;
/*  It occurs when you made some mistakes in code, and the flow of your code breaks;
,when an Exception occurs, after the line where it occurs will not be executed, so in that case an exception is thrown by java . To prevent the breaking of program flow, we need to handle these exceptions; we can do it by using several methods;
 */


    public static void main(String... args){

//        int arr[] = new int[5];
//        System.out.println("hii");  // this will be executed
//        System.out.println(arr[6]);  // this will throw exception -> arrayIndexOutOfBound;
//
//        System.out.println("bye");  // this wont be printed;
//        if we want that after exception our code after that particular line should be executed then we must handle this;


//    1. try catch;


//        System.out.println("hii");
////        int arr[] = new int [5];
//
//        try{
//            In try block we put those codes in which their is a chances of getting an error or exception;
//            System.out.println(arr[4]);

//            if the exception is thrown then it must be caught in catch block;
//            you can put multiple catch block to handle different exceptions;

//            System.out.println("Mai bich me hu");  // not printed

//            int a = 5;
//            int b = a/0;  // this will give exception;
//            System.out.println(b);
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage()); // exception message will be printed;
//            System.out.println("length jyada access kar rhe ho"); // custom message printed;
//        }

//         try ke andr kisi line me v flow break hoga toh wo catch m aa jayega direct , and then catch block ke bahar wale ko print karega ;

//        System.out.println("Bye");  // this will also print;



        //    2. try catch finally;
//     the code in finally block will always be executed;
//    either if the exception is thrown ro not;

//
//        System.out.println("starting");
//        try {
//            int a = 5 / 2;   // 5/0  => in both case finally block will be executed;
//        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }finally {
//            int a = 10/2;
//            System.out.println(a);  // 5
//        }


//        3. Throws keyword =>  It is used to show in a program that here , this method might throw this kind of  exception you may handle it ;
//        It is just used for indicating that here something bad can happen;


//       try{
//           foo();
//       }catch (RuntimeException e){
//           System.out.println("error handle kar liya");
//       }


//        4. Thow object;

//         this is used to throw an custom exception in java;

        Scanner sc =  new Scanner(System.in);
        System.out.println("enter age");
        try{

            int age = sc.nextInt();
            if(age >100){

// jis exception ko throw kroge usiko catch v karna padega;
                throw new Exception("Age invalid hai");
            }

        }catch(Exception e){
            System.out.println(e.getMessage());  // aapka throw kiya hua message isme show hoga;
            System.out.println("error aa gaya");

        }
    }

//    static void foo() throws ArithmeticException
//    {
//        System.out.println("hello jee");
//        int a = 5/0;
//    }


}
