package JDBC.TransactionControl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionHandling {

//    connectDB;
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
        performTransaction(connect);
    }catch (SQLException e){
        e.printStackTrace();
    }

}

// create a method to perform a transaction ;
    static void performTransaction(Connection connect){
        String withdrawQuery = "update transaction set balance = balance - ? where acc_num = ?";
        String depositQuery = "update transaction set balance = balance + ? where acc_num = ?";

// initialize Transaction ;
        try{
            PreparedStatement withdrawStatement = connect.prepareStatement(withdrawQuery);
            PreparedStatement depositStatement = connect.prepareStatement(depositQuery);

//            withdraw from acc1;
            withdrawStatement.setInt(1,1000);
            withdrawStatement.setString(2,"acc_2");

//            deposit in acc2;
            depositStatement.setInt(1,1000);
            depositStatement.setString(2,"acc_1");
            int withdrawRowAffect = withdrawStatement.executeUpdate();
            int depositRowAffect = depositStatement.executeUpdate();

// check if states are consistent; if consistent then do commit the changes;
            if(withdrawRowAffect >0 && depositRowAffect >0){
                connect.commit();
                System.out.println("Transaction Successful");
            }else {
                connect.rollback();  // if any kind of inconsistency occurs then rollback the transaction;
                System.out.println("Transaction Failed");
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
