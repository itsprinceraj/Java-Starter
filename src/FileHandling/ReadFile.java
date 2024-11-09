package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    static void readFileJava(){
        String file = "javaFile.txt";
        try(FileReader reader = new FileReader(file)){
//            .read() -- this methods reads character and returns integer, and return -1 if it reads the complete file;
            int count;
            do{
                count  = reader.read();
                System.out.print((char) count);
            }while(count != -1);
        }catch(IOException e){
            System.out.println("error occurred");
            System.out.println();
        }

    }

//     main method
    public static void main(String... args){
        readFileJava();
    }

}
