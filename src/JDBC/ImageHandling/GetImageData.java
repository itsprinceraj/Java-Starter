package JDBC.ImageHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

public class GetImageData {

//     create a function for dbConnect;
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
        getImage(connect);
    }catch (SQLException e){
        e.printStackTrace();
    }


}


// write a function to fetch data from DB;
    static void getImage(Connection connect){
        String query = "select image_data from imagedata where id = (?);";
        String path = "C:\\Users\\rajro\\Desktop\\GIT-REPO\\JAVA REPO\\Java Starter\\images\\"; // add path where you want to save data;
//        get image from database;
        try{
            PreparedStatement prepState = connect.prepareStatement(query);
            prepState.setInt(1,1);
            ResultSet result = prepState.executeQuery();

            if(result.next()){

//            store image binary data ;
                byte[] image = result.getBytes("image_data");

// convert binary data into file;
                String imagePath = path +"extracted.png";
                FileOutputStream output = new FileOutputStream(imagePath);  // it takes path where you have to store the file;

//             now write the data into the path;
                output.write(image);

                System.out.println("image extracted successfully");
            }else {
                System.out.println("Unable to get image");
            }

        }catch (SQLException e ){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


// MAIN FUNCTIOIN ;
    public static void main(String[] args) {
        dbConnect();
    }

}
