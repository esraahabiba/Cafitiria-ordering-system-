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
public class customermaker {
    private customerbuilder builder;

    public customermaker(customerbuilder builder) {
        this.builder = builder;
    }

    public void buildcustomer() {
        builder.customerid();
        builder.customername();
        builder.customerphone();
        builder.customermail();
        builder.customeraddress();
        builder.customerpassword();
        

    }
    
}
