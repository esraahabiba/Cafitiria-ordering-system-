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
 public interface CustomerDAO {
	Customer getCustomerById(int id);
        Customer getCustomerByName(String name);
	List<Customer> getAllCustomers();
	boolean insertCustomer(Customer customer);
	boolean updateCustomer(Customer custome);
	boolean deleteCustomerById(int id);
	boolean deleteCustomerByName(String name);
}