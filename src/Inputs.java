import java.util.Scanner; // Command to import Scanner class in java
import java.io.Console;

public class Inputs{
    public static void main(String... args){

        // Reading input from user by using Scanner method by creating a new object

        Scanner sc = new Scanner(System.in);  // Here system.in depicts that standard user input can be read

        //int $num1 = sc.nextInt(); // nextInt is inbuilt method of Scanner
//        float $num2 = sc.nextFloat();
//        System.out.println("Result = "+ $num1 * $num2);

        String $str = sc.next();
        System.out.println($str);
        //String str = sc.nextLine(); // for string there is not nextString method in java Scanner clas "so" we use nextLine method ;
        // Note: If we use next() method of Scanner class then java will read input only until a broken word ;
//        System.out.println(str);

        // Reading input from user by using ioConsole class
//        Console console = System.console();  // we have successfully created our object using console class ,now we can easily read inputs from user;

//        String userName = console.readLine();
//        System.out.println(userName);
        // There is problem with console class in java , that we can only read Strings not any other values;



    }
}