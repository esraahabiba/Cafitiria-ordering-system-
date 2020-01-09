/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author laban
 */
public class Manager {

        private int id=1;
	private String name;
	private String phone;
	private String mail;
        private String address;
        private String password;
        private static Manager uniqueInstance=null;
        
       private Manager(){}
        
        private Manager(String name, String phone, String mail,String address) {
		super();
                this.id++;
		this.name = name;
		this.phone=phone;
		this.mail = mail;
                this.address=address;
	}
	
	public Integer getId() {
		return id++;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getphone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
        public String getAddress() {
		return address;
	}
	public void setAddress(String Address) {
		this.address =Address;
	}
        public void setpassword(String password){
            this.password=password;
        }
        public String getpassword(){
            return password;
        }
        public String toString() {
		return "Name: " + this.name + ", Phone: " + this.phone + ", Mail: " + this.mail +", Address:"+this.address; 
	}
        public static Manager getInstance() {
            Connection connection=MySqlDAOFactory.getConnection();
            try{
        Statement statement3 = connection.createStatement();
        ResultSet res = statement3.executeQuery("SELECT * FROM `manager` ");
        if(res.next()){
           return uniqueInstance;
        }
           else {
			uniqueInstance = new Manager();
        }	
	}catch(SQLException e){
            e.printStackTrace();
        }
      return uniqueInstance;  
}
}

