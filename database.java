package elictricityBilling;
import java.sql.*;
public class database {
    Connection connection;
    Statement statement;
    database(){
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pk", "root", "root");
                statement  = connection.createStatement();
            } catch (Exception e) {
                System.out.println("error" + e.toString());
            }
        }
    }




