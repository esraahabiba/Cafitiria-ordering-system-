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
public class Customer {

        private Integer id=10;
	private String name;
	private String phone;
	private String mail;
        private String address;
	private String pass;
        
        public Customer(){}
	public Customer(Integer id, String name, String phone, String mail,String address) {
		super();
                this.id = id;
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
		return mail;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.name + ", Phone: " + this.phone + ", Mail: " + this.mail +", Address:"+this.address; 
	}

    void setpassword(String pass) {
        this.pass=pass;
    }
    String getpass(){
        return pass;
    }
	
}