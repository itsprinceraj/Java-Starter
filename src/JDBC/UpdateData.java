package JDBC;

import java.sql.*;

public class UpdateData {
    static String url = "jdbc:mysql://localhost:3306/students";
    static String userName = "root";
    static String pass = "5466";
    static String updateQuery = "UPDATE student SET name = 'Ayush Badiyal' , roll = 54 where id = 4; ";
    static String selectQuery = "select * from student";


    //    create function to load drivers;
    public static void loadDrivers(){
        //        load Drivers;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println("Driver Loading failed");
            e.printStackTrace();
        }

    }

    //     create a connect method;
    public static void connectDb(){
        try{
            Connection connect = DriverManager.getConnection(url,userName,pass);
            System.out.println("DB connection successfull");

//            Update data into database;
            Statement stmt = connect.createStatement();
            int rowsAffected = stmt.executeUpdate(updateQuery);

//            apply checks;
            if(rowsAffected > 0){
                System.out.println("update successful " + rowsAffected + " row's updated;");
            }else {
                System.out.println("Inundation Failed");
            }

//             show data;
            ResultSet result = stmt.executeQuery(selectQuery);

            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int roll = result.getInt("roll");

//            print data;
                System.out.println("id: " + id);
                System.out.println("name: " + name);
                System.out.println("roll: " + roll);
            }

//             Deallocate resources;
            connect.close();
            stmt.close();
            result.close();
            System.out.println("Resource Deallocated");
        }catch (SQLException e){
            System.out.println("DB connection failed");
            e.printStackTrace();
        }
    }

    //    main function;
    public static void main(String[] args) {

        loadDrivers();
        connectDb();
    }
}
