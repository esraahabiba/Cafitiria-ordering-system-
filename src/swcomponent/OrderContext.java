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
public class OrderContext {
    OrderState orderstate;
    public OrderContext(){
        orderstate= new Ordered();
    }
   public void Ordered(Order order) throws InterruptedException,NullPointerException{
		orderstate= orderstate.handleInput();
	//	 orderstate.update(order);
	}
}
