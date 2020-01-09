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
public class ItemMaker {
    ItemBuilder itbuilder;
    ItemMaker(ItemBuilder itembuilder){
       this.itbuilder=new ItemBuilder();
    }
   public void buildItem(){
       itbuilder.setSize("small");
   }
}
