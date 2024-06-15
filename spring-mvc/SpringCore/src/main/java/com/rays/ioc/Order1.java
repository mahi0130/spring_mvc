package com.rays.ioc;

public class Order1 {
	
	private Payment payment;
	private Inventory inventory;
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	
	public void BookATicket(int item) {
		int price = 10;
		double totalamount = item *price; 
	double updatebalance = 	payment.makePayment(totalamount);
	int updatestock = inventory.sold(item);
	System.out.println("Ticket are booked");
	System.out.println("Total amount paid: "+ totalamount);
	System.out.println("Remaining balance: "+ updatebalance);
	System.out.println("update stock:" +updatestock);
	
		
	}

}
