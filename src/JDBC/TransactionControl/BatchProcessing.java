package JDBC.TransactionControl;

import java.sql.*;

public class BatchProcessing {
//     connect DB;
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

//            by default connect method has autoCommit true;
//we want when transaction is successful then commit only;  so we need to make it false;
        connect.setAutoCommit(false);
        performBatchProcess(connect);
    }catch (SQLException e){
        e.printStackTrace();
    }

}

//n  create a batchProcess function to do batch operations;
    static void performBatchProcess(Connection connect){
        // Batch process using Statement Interface;
//        try{
//            connect.setAutoCommit(false);
//            Statement stmt = connect.createStatement();
//            stmt.addBatch("insert into student (id, name, roll) values (6, 'Avinash kr', 06) ");
//            stmt.addBatch("insert into student (id, name, roll) values (7, 'Shitesh Jha', 61 )");
//            stmt.addBatch("insert into student (id, name, roll) values (8, 'Kamran Rafique', 55) ");
//            int[] results = stmt.executeBatch();
//            if(results.length > 0){
//                connect.commit();
//                System.out.println("Batch process executed");
//            }else {
//                System.out.println("Failed to perform Batch ops.");
//            }
//
//        }catch (SQLException e){
//            e.printStackTrace();
//        }


        try{
            // Batch process using PreparedStatement Interface;
            connect.setAutoCommit(false);
            PreparedStatement prepStatement = connect.prepareStatement("insert into student (id , name, roll) values(?,?,?)");
            prepStatement.setInt(1,9);
            prepStatement.setString(2,"Shivam lalothra");
            prepStatement.setInt(3,11);
            prepStatement.addBatch();

            prepStatement.setInt(1,10);
            prepStatement.setString(2, "Arun kr");
            prepStatement.setInt(3, 9);
            prepStatement.addBatch();

            prepStatement.setInt(1,12);
            prepStatement.setString(2,"Ambhuj kr");
            prepStatement.setInt(3, 15);
            prepStatement.addBatch(); // for each row we have to add the batch into the process;

            int[] results = prepStatement.executeBatch();


            for (int result : results) {
                System.out.println("rows affected: " + result);
            }

            if(results.length > 0){
                connect.commit();
                System.out.println("Batch executed");
            }else {
                System.out.println("Failed to execute batch");
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
    }


//    main function ;
    public static void main(String[] args) {
        dbConnect();
    }
}
