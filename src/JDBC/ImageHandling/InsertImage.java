package JDBC.ImageHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage {

//    function for Database connection ;
    static void dbConnect(){
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String pass = "5466";

        try{
            //          load drivers;
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }

      try{
          Connection connect = DriverManager.getConnection(url,username,pass);
          System.out.println("DB connection successfull");
          sendImageData(connect);

      }catch (SQLException e){
          e.printStackTrace();
      }


    }



    // write a function for uploading image data to database;
    static void sendImageData(Connection connect){
        String querry = "insert into imagedata (image_data) values(?)";
        String path = "C:\\Users\\rajro\\Desktop\\GIT-REPO\\JAVA REPO\\Java Starter\\images\\photo1.png";

//         read image from file;
       try(FileInputStream input = new FileInputStream(path);){

// image will be stored in binary bits, in database and in java also


//           it is a good practice to store file data into an array;
//           if you don't know the size of the data you are going to store from an input file, then there is method from FileinputStream class;
           byte[] image = new byte[input.available()]; // image will be stored in binary form ;
           int bytesRead = input.read(image);  // image readed in binary form ;
           System.out.println(bytesRead+" bytes readed;");


//            insert image into database;
          try{
              PreparedStatement prepState = connect.prepareStatement(querry);
              prepState.setBytes(1, image);
              int rowsAffected = prepState.executeUpdate();

              if(rowsAffected > 0){
                  System.out.println("image inserted to db successfully");
              }else {
                  System.out.println("Unable to insert images to db;");
              }
          }catch (SQLException e){
              e.printStackTrace();
          }

       }catch (IOException e){
           e.printStackTrace();
       }
    }

//    main function ;
    public static void main(String[] args) {
        dbConnect();
    }
}



