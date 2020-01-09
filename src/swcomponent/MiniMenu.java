/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
//import static swcomponent.MiniMenu.items;

/**
 *
 * @author laban
 */
public class MiniMenu extends Menu implements java.util.Observer{
   static List<Item>items=new ArrayList<>();
    
    @Override
 //   }
    public void Add(Item item){
        items.add(item);
    }
    @Override
    public void remove(Item item){
        items.remove(item);
    }
    @Override
    public Menu getParent(){
         return parent;
    }
    @Override
   public String Operation(Item item){
        return item.description; 
    }

    @Override
    public void update(Observable o, Object ol) {
        System.out.println("new item "+ol);
    }
     

}
