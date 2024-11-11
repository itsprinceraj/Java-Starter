package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class GetData {
    static String url = "jdbc:mysql://localhost:3306/students";
    static String userName = "root";
    static String password = "5466";
    static String querry = "select * from student;";


    public static void connectDb(){
//Connect java to database using DriverManager getConnection method which takes 3 argumment , url, username and password;
        try(Connection connect = DriverManager.getConnection(url,userName,password)){
            System.out.println("DB Connected");

//             create a statement;
            Statement stmt = connect.createStatement();
            ResultSet result = stmt.executeQuery(querry);

//            apply check of result does not have any data;
            if (!result.isBeforeFirst()) {
                System.out.println("No data found in the result set.");
            }
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int roll = result.getInt("roll");

//                 print the data;
                System.out.println("-------------------");
                System.out.println("id: "+ id);
                System.out.println("name: " +name);
                System.out.println("roll: " +roll);
            }

            connect.close();
            stmt.close();
            result.close();
            System.out.println("Resources closed");
        }catch(Exception e){
            System.out.println("DB connection failed");
            e.printStackTrace();
        }
    }


    public static void main(String[] args){
//         load drivers;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully");

        }catch(ClassNotFoundException e){
            System.out.println("Error while loading drivers");
            e.printStackTrace();
        }
        connectDb();
    }

}
