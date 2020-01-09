/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swcomponent;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author laban
 */
public class Ordered implements OrderState{

	@Override
	public OrderState handleInput() throws InterruptedException {
  
            //  wait(60000);
          //  update(order);
                EndOfState();
              //  wait(60000);
               // Delay(5000);
                return new OrderPreparing().handleInput();
		
	}

	@Override
	public void update(Order order) {
		order.setStatus("Ordered");
	}

	@Override
	public void EndOfState() {
		Menu1.jLabel6.setText("Ordered Done");
	}
}
