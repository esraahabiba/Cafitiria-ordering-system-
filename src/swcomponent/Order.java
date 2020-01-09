/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swcomponent;

import java.util.Date;

/**
 *
 * @author laban
 */
public class Order {
    private Integer id ;
    private Date date;
    private double TotalPrice;
    private String PaymentMethod;
    String OrderState;
   public int Cus_id;
  
    public Order(){
     OrderState = "Ordering";  
    }
    public Order(Integer id,Date date,double TotalPrice,String PaymentMehod){
        this.id=id;
        this.date=date;
        this.TotalPrice=TotalPrice;
        this.PaymentMethod=PaymentMehod;
    }
  
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
        public Date getdate() {
		return date;
	}
        public void setDate(Date date) {
		this.date = date;
	}
	public void setTotalPrice(double TotalPrice) {
		this.TotalPrice = TotalPrice;
	}
        public double getTotalPrice() {
		return TotalPrice;
	}
        public void setPaymentMethod(String PaymentMethod) {
		this.PaymentMethod = PaymentMethod;
	}
        public String getPaymentMethod() {
		return PaymentMethod;
	}
        public void setStatus(String state){
            OrderState=state;
        }
        public String getStatus(){
           return OrderState;
        }
        public void Cancelled(){
            System.out.println("Order Cancelled");
        }
        public String toString(){
            return "Order Id: "+id+" Date: "+date+" TotalPrice : "+TotalPrice+" PayMethod: "+PaymentMethod;
        }
}
