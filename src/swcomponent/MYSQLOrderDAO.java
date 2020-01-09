/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laban
 */
public class MYSQLOrderDAO implements OrderDAO{
    private Connection connection;
	
	public MYSQLOrderDAO() {
		this.connection = MySqlDAOFactory.getConnection();
	}
	
	@Override
	public Order getOrderById(int id) {
		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT * FROM `order` WHERE Order_id = " + id);
			
			if(res.next()) {
				Order order = new Order();
				order.setId(res.getInt("Order_id"));
				order.setDate(res.getDate("Date"));
				order.setPaymentMethod(res.getString("Pay_Method"));
				order.setTotalPrice(res.getDouble("Total_Price"));
				return order;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public List<Order> getAllOrders() {
		try {
			Statement statement = connection.createStatement();
			ResultSet res = statement.executeQuery("SELECT * FROM `order`");
			
			List<Order> orders = new ArrayList<>();
			
			while(res.next()) {
				Order order = new Order();
				order.setId(res.getInt("Order_id"));
				order.setDate(res.getDate("Date"));
			        order.setPaymentMethod(res.getString("Pay_Method"));
				order.setTotalPrice(res.getDouble("Total_Price"));
				orders.add(order);
			}
			return orders;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean insertOrder(Order order) {
		try {
                      System.err.println(order == null);
			PreparedStatement statement = connection.prepareStatement("INSERT INTO `order` VALUES (?, ?, ?, ?,?)");
			statement.setInt(1, order.getId());
			statement.setDate(2, (Date) order.getdate());
			statement.setDouble(3, order.getTotalPrice());
			statement.setString(4, order.getPaymentMethod());
                        statement.setInt(5,3);

			int res2 = statement.executeUpdate();
			if(res2 == 1) {
				return true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateOrder(Order order) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteOrderById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
