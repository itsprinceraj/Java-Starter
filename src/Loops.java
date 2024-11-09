import java.util.Scanner;

public class Loops {
    public static void main(String... args){
//        System.out.println("Loops");

// *************** for loop ******************
//        System.out.println("For loop");
//        for(int i = 1; i<=10; i++){
//            System.out.println(i);
//        }

// *************** While loop ********************88
//        System.out.println("while loop");
//        int i =1;
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }

//  *************************   Do while loop ******************8

//         the do while loop is also called exit control loop
//                System.out.println("Do While loop");
//                int i=1;
//                do{
//                    System.out.println(i);
//                    i++;
//                }while(i<=10);


//  ************* Largest of N numbers **************
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of digits you want to compare with: ");
//        int n = sc.nextInt();
//        System.out.println("enter " + n + " numbers:");
//        int maxVal = Integer.MIN_VALUE;   // store integer min value
//        for(int i =1; i<=n; i++){
//            int current = sc.nextInt();
//            maxVal = Math.max(maxVal, current);
//        }
//        System.out.println("The Largest number from the given inputs are: "+  maxVal);



//  *************** Counting the input digits ****************88

// for counting the inputs you have to repeatedly divide the input by 10 until we get 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the digit : ");
//        int n = sc.nextInt();
//        int i = 0;
//
//        while(n>0){
//            n = n/10;
//            i++;
//        }
//
//        System.out.println("the number of digits of input are: "+i);

//*************** sum of positive numbers **********************
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int n;
//        do{
//            n = sc.nextInt();
//            if(n >= 0){
//                sum += n;
//            }
//        }while(n >= 0);
//        System.out.println( "sum of positive numbers are: " + sum);

// ************* Break and Continue Statement *****************
//        int i;
//        for(i = 1; i<=5; i++){
//            if(i==3){
//                continue;  // it skips the current iteration ;
//            } else if (i==5) {
//                break; // terminate the iteration
//
//            }
//            System.out.println(i);
//        }


// ************** Random Games *****************
//         Print random numbers form 1 to 10 and ,when it is 5 get out of the loop

//        while(true){
//            int num = (int) (Math.random() * 20 +1);
//            if(num == 20){
//                break;
//            }
//            System.out.println(num);
//        }

        // print pattern;
//        int n = 5;
//        for (int r =0; r< n; r++){
//
//            for(int s =0; s<n-r-1; s++){
//                System.out.print(" ");
//            }
//
//            for(int c =0; c< r; c++){
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }




    }
}
