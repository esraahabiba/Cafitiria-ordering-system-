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
public class OrderDelivered implements OrderState{

	@Override
	public OrderState handleInput() {
	 EndOfState();
            return null;
	}

	@Override
	public void update(Order order) {
		order.setStatus("Delivered");
	}

	@Override
	public void EndOfState() {
				Menu1.jLabel11.setText("Delivered");
	}
}
    


