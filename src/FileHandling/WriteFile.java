package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    static String file = "javaFile.txt";

    public static void main(String[] args) {

//     create an object of FileWriter with the instance of file;
//    if you handle the exception using simple try-catch then you need to handle it for close as well . because close also throws exception;

//        handleFile();
        handleWithThrowResource();


    }

//     create a fileHandling method;
    static void handleFile(){
        FileWriter writer = null;
        try{
            writer = new FileWriter(file); // it must be under try-catch;
            writer.write("This is the first file \n");
            writer.write("My name is prince raj");
            writer.write("\nI am a Full Stack Web Developer");
            writer.flush();
            System.out.println("written file successfully");
        }catch(IOException e){
            System.out.println("error occurred");
            System.out.println(e.getMessage());
        }finally{
//             we need to close the file;

//            writer.close();   put this in try catch;
            try{
                writer.close();

            }catch (IOException e){
                System.out.println("error in closing the file");
            }
        }    //  here we had to handle two exceptions: first for FileWriter and second for closing the file;
//        But If we use Throw with resources then we don't even need to close the file, Java will automatically handle it;
    }

//     create a method to handle file with resources;
    static void handleWithThrowResource(){
        String file = "javaFile1.txt";
        String arr[] = {"My", "name", "is", "Prince Raj"};
        try(FileWriter writer = new FileWriter(file)){ // it will automatically close the file

            for(String data: arr){
                writer.write(data + " ");
            }
            System.out.println("written");
        }catch(IOException e){
            System.out.println("Error occurred in file ");
        }

    }
}
