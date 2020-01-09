/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.awt.ItemSelectable;
import java.util.List;

/**
 *
 * @author laban
 */
public abstract class Menu {
    Menu parent;
    //List<Item>items;
    public abstract void Add(Item item);
    public abstract void remove(Item item );
    public abstract Menu getParent();
    public abstract String Operation(Item item);
}
