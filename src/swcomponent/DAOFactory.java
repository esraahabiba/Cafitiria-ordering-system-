/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

/**
 *
 * @author laban
 */
public abstract class DAOFactory {
	// List of DAO types supported by the factory
    //public static final int MYSQLOrderDAO = 1;
	//public static final int MYSQLManagerDAO= 2;
      //  public static final int MYAQLCustomerDAO=3;
//	         static DAOFactory MySqlDAOFactory;

	// There will be a method for each DAO that can be 
	// created. The concrete factories will have to 
	// implement these methods.
	public abstract CustomerDAO getCustomerDAO();
	public abstract OrderDAO getOrderDAO();
        public abstract ManagerDAO getManagerDAO();
	
	public static DAOFactory getDAOFactory() {
			return MySqlDAOFactory.getInstance();
	    }
	}

