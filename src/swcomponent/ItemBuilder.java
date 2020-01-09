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
public class ItemBuilder {
    Item item;
    public Item CreatItem(){
         return item=new Item();
    }
    public Item getItem(){
        return item;
    }
    public void setSize(String size){
        item.size=size;
    }
}
