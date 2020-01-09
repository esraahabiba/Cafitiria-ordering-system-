/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

/**
 *
 * @author HP
 */import swcomponent.Registration;


        
    public class mycustomerbuilder extends customerbuilder {
int a ; 
String b ; 
String c; 
String d ; 
String e ; 
String f ; 

    public mycustomerbuilder(int a, String b, String c, String d, String e, String f) {
    this.a = a ; 
    this.b = b ; 
    this.c = c ; 
    this.d = d ; 
    this.e = e ; 
    this.f = f ;
    }

    @Override
    public void customerid() {
        i.setId(a);

        System.out.println("id done ");
    }

    @Override
    public void customername() {

        i.setName(b);
        System.out.println("name done ");

    }

    @Override
    public void customerphone() {
        i.setPhone(c);

        System.out.println("phine done ");
    }

    @Override
    public void customermail() {
        i.setMail(d);

        System.out.println("mail done ");
    }

    @Override
    public void customeraddress() {
        i.setAddress(e);

        System.out.println("address done ");
    }

    @Override
    public void customerpassword() {
        i.setpassword(f);

        System.out.println("pass done ");
    }

}
