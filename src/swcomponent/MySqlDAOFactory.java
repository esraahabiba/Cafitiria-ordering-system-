/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySqlDAOFactory extends DAOFactory {
	
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "";
        //http://localhost:10080/phpmyadmin/db_structure.php?db=mydb

	private static MySqlDAOFactory uniqueInstance;
	
	private MySqlDAOFactory() {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static MySqlDAOFactory getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new MySqlDAOFactory();
		}
		return uniqueInstance;
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	@Override
	public OrderDAO getOrderDAO() {
		return new MYSQLOrderDAO();
	}

        @Override
	public CustomerDAO getCustomerDAO() {
		return new MySqlCustomerDAO();
	} 
        
        
        @Override
        public ManagerDAO getManagerDAO() {
		return new MySqlManagerDAO();
	}

}