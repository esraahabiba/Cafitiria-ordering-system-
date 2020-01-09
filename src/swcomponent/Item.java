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
public class Item extends Menu{
    int id=10;
    double price;
    String name;
    String size;
    String description;
    Item(){
        id++;
    }
    public String toString (){
        return "( id  "+id+" name: "+name+" Description:  "+description+" size: "+size+" price: "+price+" )";
    }
    public String Operation(){
        return description;
    }

    @Override
    public void Add(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Menu getParent() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Operation(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
