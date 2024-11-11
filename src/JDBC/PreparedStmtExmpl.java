package JDBC;

import java.sql.*;

public class PreparedStmtExmpl {

    static void opsUsingPreparedStatement(Connection connect){

        try{
//            String query = "insert into student (id , name , roll) values(?,?,?);";
            String query = "select * from student where id = ?";
            PreparedStatement preStmt = connect.prepareStatement(query);// we can directly pass query here;


//             ******* Retrieve data from database; *******
//             execute query;
            preStmt.setInt(1,2);
            ResultSet result = preStmt.executeQuery();

//             print data;
            while(result.next()){
                int id = result.getInt("id");
                String name = result.getString("name");
                int roll = result.getInt("roll");

                System.out.println("id: "+id);
                System.out.println("name: " +name);
                System.out.println("roll: " +roll);
                System.out.println("********************");
            }


//            ******* insert data into the database *******;
//            preStmt.setInt(1, 5);
//            preStmt.setString(2,"Rajiv Ranjan");
//            preStmt.setInt(3,51);
//            int rowAffected = preStmt.executeUpdate();
//
//            if(rowAffected > 0){
//                System.out.println("Insertion successfull");
//            }else{
//                System.out.println("unable to insert into db");
//            }

            connect.close();
            result.close();
            preStmt.close();

        }catch (SQLException e){
            e.printStackTrace();
        }


    }


//     DB connection function;
    static void connectDb(){
        String url = "jdbc:mysql://localhost:3306/students";
        String username = "root";
        String pass = "5466";
        String query = "";

//       connect to mysqlDatabase;
        try{
            Connection connect = DriverManager.getConnection(url,username,pass);
            System.out.println("DB connection Successful");
            opsUsingPreparedStatement(connect);
        }catch (SQLException e){
            e.printStackTrace();
        }


    }

    static void driverLoader(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loader Successfully");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

//     main function ;
    public static void main(String[] args) {
        driverLoader();
        connectDb();
    }
}
