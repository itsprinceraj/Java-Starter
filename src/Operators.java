import java.util.Scanner;

public class Operators {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

        // Relational Operator
//        System.out.println("enter num1: ");
//        int a = sc.nextInt();
//
//        System.out.println("enter num2: ");
//        int b = sc.nextInt();

        // now check relations among different values
//        System.out.println(a > b);
//        System.out.println(a < b);
//        System.out.println(a >= b);
//        System.out.println(a <= b);
//        System.out.println(a == b);
//        System.out.println(a != b);

        // unary operators;
        int x = 5;

        //Post Increment and Decrement Operator;
        System.out.println(x++); // post-Increament operator (5)
        System.out.println(x); // 6

        System.out.println(x);  // currently x is 6 ;

        System.out.println(x--); // post-Decreament  (6)
        System.out.println(x);  // (5);

        //pre increment or decrement will also behave similar to this;
    }
}
