package projects;
import java.util.Scanner;


public class SI_Calculator {
    //  Create a Simple Interest Calculator using java
    public static void main(String... argument){
        Scanner sc = new Scanner(System.in); // Scanner Object Created;

        System.out.println("enter principle amount: ");
        int P = sc.nextInt();

        System.out.println("enter rate of interest: ");
        double R = sc.nextDouble();
        R /= 100 ;

        System.out.println("enter time period: ");
        int T = sc.nextInt();
        T *= 12 ;
        double $result = (P * R * T)/100;
        System.out.println($result);
    }

    // Note: this calculator is not perfect yet, i'll visit later when ill learn loops and conditions in java and then i'll correct it ;

}
