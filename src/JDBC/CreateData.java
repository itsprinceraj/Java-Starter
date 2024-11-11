package JDBC;

import java.sql.*;

public class CreateData {

    static String url = "jdbc:mysql://localhost:3306/students";
    static String userName = "root";
    static String pass = "5466";
    static String query = "INSERT INTO student(id ,name, roll) values(6 , 'Aditya Goel' , 044 ) ";
    static String selectQuery = "select * from student;";

//     create a function to connect db;
    public static void connectDb(){
        try(Connection connect = DriverManager.getConnection(url,userName,pass)){
            System.out.println("DB Connected Successfully");

//            insert data into database;
            Statement stmt = connect.createStatement();
            int rowsAffected = stmt.executeUpdate(query);  // it returns integer , that how many rows get affected;

//            apply checks;
            if(rowsAffected > 0){
                System.out.println(rowsAffected + " row's Affected");
            }else {
                System.out.println("Insertion Failed");
            }

// retrieve data to see that data is inserted successfully or not ;

//   executeQuery is used to print data using select query;
            ResultSet result = stmt.executeQuery(selectQuery);

            while (result.next()) {
                int id = result.getInt("id");
                String name = result.getString("name");
                int roll = result.getInt("roll");

//                Print data;
                System.out.println("id: " +id);
                System.out.println("name: " +name);
                System.out.println("roll: " +roll);
                System.out.println("-------------");
            }

//            Deallocate all the resources;
            connect.close();
            stmt.close();
            result.close();
            System.out.println("Resources  Deallocated;");

        }catch (SQLException e){
            System.out.println("DB connection Failed");
            e.printStackTrace();
        }
    }


//     main function;
    public static void main(String[] args) {

//         load drivers;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");

        }catch (ClassNotFoundException e){
            System.out.println("Error while loading driver");
            e.printStackTrace();
        }

//         call connectDb function ;
        connectDb();
    }

}
