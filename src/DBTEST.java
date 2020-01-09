
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBTEST {
public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "";
        
        
        public static void main (String[] args){
        connection conn=null;
        
        try {
        conn= (connection) DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        System.out.println("connected");
        }
        catch(SQLException e){System.err.println(e);}}

    private static class connection {

        public connection() {
        }
    }
        
    
}
