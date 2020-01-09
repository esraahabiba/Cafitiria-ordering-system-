/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

/**
 *
 * @author HP
 */
public class Controller implements java.awt.event.ActionListener{
 Component v;
public Controller() {	
		System.out.println ("Controller()");
	}

 @Override
	public void actionPerformed(java.awt.event.ActionEvent e){
		System.out.println("Controller: acting on Model");
		//model.incrementValue();
	}

	public void addModel(model m){
		System.out.println("Controller: adding model");
		//this.model = m;
	}

	public void addView(Component v){
		System.out.println("Controller: adding view");
		this.v = v;
	}

	public void initModel(int x){
		//model.setValue(x);
	}
}


