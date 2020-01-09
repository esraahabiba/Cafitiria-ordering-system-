/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

/**
 *
 * @author HP
 */
public abstract class customerbuilder {
    
    Customer i;
    
    public void customerbuilder() {
        i = new Customer();
    }

    public Customer getcustomer() {
        return i;
    }

    public abstract void customername();

    public abstract void customerid();

    public abstract void customermail();
    
    public abstract void customerpassword();
    
     public abstract void customerphone();
     
      public abstract void customeraddress();
    
   // public abstract void displaycustomer();
    
    
}
