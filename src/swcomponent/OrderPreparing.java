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
public class OrderPreparing implements OrderState{
    
    
    public OrderState handleInput() throws InterruptedException {
		     
                    EndOfState();
//                     wait(120000);
		    return new OrderDelivered().handleInput();
		
	}

	@Override
	public void update(Order order) {
		order.setStatus("Perparing");
	}

	@Override
	public void EndOfState() {
				Menu1.jLabel9.setText("Perpering Done");

	}
}
    

