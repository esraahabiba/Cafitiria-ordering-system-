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
public interface OrderState {
    OrderState handleInput() throws InterruptedException;
	void update(Order order);
        void EndOfState();
}
