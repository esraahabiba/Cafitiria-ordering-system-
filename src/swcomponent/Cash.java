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
public class Cash implements PaymentMethod{

    
   static double x;
    public void pay(double x) {
        this.x=x;
     System.out.print("ur  total  price "+x);
    }
    
}
