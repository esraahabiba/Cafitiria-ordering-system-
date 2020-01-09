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
public class CreditCard implements PaymentMethod{
   // String name;
    String cardNumber;
    String cvv;
    String dateOfExpiry;

    public CreditCard(String cardNumber,String cvv,String dateOfExpiry) {
      //  this.name=name;
        this.cardNumber=this.cardNumber;
        this.cvv=cvv;
        this.dateOfExpiry=this.dateOfExpiry;
    }

    @Override
    public void pay(double x) {
        System.out.println("Payment with CreditCard "+x);
    }
    
}
