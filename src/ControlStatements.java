import java.util.Scanner;

public class ControlStatements {
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//
//        int result = a % 2;
//
//        // write conditon to check if the input is even or odd
//        if(result == 0){
//            System.out.println(a + " is Even Number");
//        }else System.out.println(a + " is Odd Number");

        // check for the input char is vowel or not;

//        char ch = sc.next().toLowerCase().charAt(0);
//        if(ch == 'a') {
//            System.out.println(ch + " is vowel");
//        }else if(ch == 'e'){
//            System.out.println(ch + " is vowel");
//        }else if(ch == 'i'){
//            System.out.println(ch + " is vowel");
//        }else if(ch == 'o'){
//            System.out.println(ch + " is vowel");
//        }else if(ch == 'u'){
//            System.out.println(ch + " is vowel");
//        }else System.out.println(ch + " is Consonant");


        // check for the input char is vowel or not using SwitchCase;

        char letter = sc.next().toLowerCase().charAt(0);

//        switch (letter){
//            case 'a':
//                System.out.println(letter + " is Vowel");
//                break;
//            case 'e':
//                System.out.println(letter + " is Vowel");
//                break;
//            case 'i':
//                System.out.println(letter + " is Vowel");
//                break;
//            case 'o':
//                System.out.println(letter + " is Vowel");
//                break;
//            case 'u':
//                System.out.println(letter + " is Vowel");
//                break;
//            default: System.out.println(letter + " is Consonant")    ;
//
//        }


        // convert the abouve switch statement into advance switch case syntax

        switch (letter){
            case 'a' , 'e' , 'i' , 'o' , 'u' -> {
                System.out.println(letter + " is Vowel");
            }
            default -> System.out.println(letter + " is Consonant")    ;

        }


    }
}
