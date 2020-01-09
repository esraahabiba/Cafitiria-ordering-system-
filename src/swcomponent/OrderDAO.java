/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.util.List;

/**
 *
 * @author laban
 */
public interface OrderDAO {
        Order getOrderById(int id);
	List<Order> getAllOrders();
	boolean insertOrder(Order order);
	boolean updateOrder(Order order);
	boolean deleteOrderById(int id);
}

