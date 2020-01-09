/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MySqlManagerDAO implements ManagerDAO {
	
	private Connection connection;
	
	public MySqlManagerDAO() {
		this.connection = MySqlDAOFactory.getConnection();
	}
        
	
	@Override
	public Manager getManagerById(int id) {
		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT * FROM `manager` WHERE Man_id = " + id);
			
			if(res.next()) {
				Manager manager = Manager.getInstance();
				manager.setId(res.getInt("Man_id"));
				manager.setName(res.getString("Man_Name"));
				manager.setMail(res.getString("Email"));
				manager.setPhone(res.getString("Phone"));
                           	manager.setAddress(res.getString("Address"));
				return manager;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Manager getManagerByName(String Name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Manager> getAllManagers() {
		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT * FROM `manager`");
			
			List<Manager> managers = new ArrayList<>();
			
			while(res.next()) {
				Manager manager =Manager.getInstance();
				manager.setId(res.getInt("Man_id"));
				manager.setName(res.getString("Man_Name"));
				manager.setMail(res.getString("Email"));
				manager.setPhone(res.getString("Phone"));
                           	manager.setAddress(res.getString("Address"));
				managers.add(manager);
			}
			return managers;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertManager(Manager manager) {
		try {
                    
			PreparedStatement statement = connection.prepareStatement("INSERT INTO `manager` VALUES (?,?, ?, ?, ?,?)");
			statement.setInt(1, manager.getId());
			statement.setString(2, manager.getName());
			statement.setString(3, manager.getphone());  
                        statement.setString(5, manager.getAddress());
                        statement.setString(4, manager.getMail());
                        statement.setString(6, manager.getpassword());
			int res = statement.executeUpdate();
			if(res == 1) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateManager(Manager manager) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteManagerById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteManagerByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}