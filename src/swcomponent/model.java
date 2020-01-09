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
public class model extends java.util.Observable{
   static int counter;
    public model(){
		System.out.println("Model()");
	} 
	
	public void setValue(int value) {
		this.counter = value;
		System.out.println("Model init: counter = " + counter);
		setChanged();
		notifyObservers(counter);
	}
	
	 public void incrementValue() {
		counter++;
		System.out.println("Model     : counter = " + counter);
		setChanged();
		notifyObservers(counter);
	}
	MainWindow  lo=new MainWindow();
     
}

