package com.pirai.busreservation;
/* @author  santhosh
 * @version 14-11-2023
 * @code    Java Program for Bus Reservation System
 */
public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;
	private String destination;
	
	Bus(int no,boolean ac,int cap,String destination){
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
		this.destination = destination;
	}
	
	public int getBusNo() {    //accessors method
		return busNo;
	}
	
	public boolean isAc() {
		return ac;
	}
	
	public int getCapacity() {    
		return capacity;
	}
	
	public  String getDestination() {
		return destination;
	}
	public void setAc(boolean val) {   //mutarato method
		ac = val;
	}
	
	public void setCapacity(int cap) {   
		capacity = cap;
	}

	//@displayBusInfo for the purpose of display the bus details
	public void displayBusInfo() {
		System.out.println("Bus No:" + busNo + " AC:" + ac + " Total Capacity: " + capacity + " Destination is:" + destination);
	}
}
