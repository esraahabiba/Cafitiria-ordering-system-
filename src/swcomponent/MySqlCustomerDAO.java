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

public class MySqlCustomerDAO implements CustomerDAO {
	
	private Connection connection;
	
	public MySqlCustomerDAO() {
		this.connection = MySqlDAOFactory.getConnection();
	}
	
	@Override
	public Customer getCustomerById(int id) {
		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT * FROM `customer` WHERE Cus_id = " + id);
			
			if(res.next()) {
				Customer customer = new Customer();
				customer.setId(res.getInt("Cus_id"));
				customer.setName(res.getString("Cus_name"));
				customer.setMail(res.getString("email"));
				customer.setPhone(res.getString("phone"));
                           	customer.setAddress(res.getString("Address"));
				return customer;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Customer getCustomerByName(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT * FROM `customer`");
			
			List<Customer> customers = new ArrayList<>();
			
			while(res.next()) {
				Customer customer = new Customer();
				customer.setId(res.getInt("Cus_id"));
				customer.setName(res.getString("Cus_name"));
				customer.setMail(res.getString("email"));
				customer.setPhone(res.getString("phone"));
                           	customer.setAddress(res.getString("Address"));
				customers.add(customer);
			}
			return customers;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		try {
                    System.err.println(customer == null);
			PreparedStatement statement = connection.prepareStatement("INSERT INTO `customer` VALUES (?, ?, ?, ?, ?,?)");
			statement.setInt(1, customer.getId());
			statement.setString(2, customer.getName());
			statement.setString(3, customer.getphone());
                        statement.setString(4, customer.getMail());
                        statement.setString(5, customer.getAddress());
                        statement.setString(6, customer.getpass());
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
	public boolean updateCustomer(Customer customer) {
		return false;
	}

	@Override
	public boolean deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomerByName(String name) {
		// TODO Auto-generated method stub
		return false;
	}

}