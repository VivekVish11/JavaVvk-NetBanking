package Connection;


//import java.sql.DriverManager;
import java.sql.*;                  
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/bank?zeroDateTimeBehavior=convertToNull","root","");
            return conn;
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
    
}
