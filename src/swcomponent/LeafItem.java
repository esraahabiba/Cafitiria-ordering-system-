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
public class LeafItem extends Item{

    int id;
    double price;
    String name;
    String size;
    String description;
@Override
    public String toString (){
        return "( id  "+id+" name: "+name+" size: "+size+" price: "+price+" )";
    }
@Override
    public String Operation(){
        return description;
    }
    
}
