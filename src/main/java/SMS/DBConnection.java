package SMS;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection getConnection(){

         String URL = "jdbc:mysql://localhost:3306/studentdb";
         String user = "root";
         String password = "982105";

         Connection con = null;
         try{
             // Create Connections;
            con = DriverManager.getConnection(
                     URL,
                     user,
                     password
             );

         }
           catch(Exception e){
             e.printStackTrace();
           }

         return con;
    }
}
