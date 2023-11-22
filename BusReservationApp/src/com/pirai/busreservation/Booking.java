package com.pirai.busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
/* @author  santhosh
 * @version 14-11-2023
 * @code    Java Program for Bus Reservation System
 */
public class Booking implements Reservable{
	public String passengerName;
	public int busNo;
	public Date date;
	
	//creating a constructor cause of collecting data
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter bus No: ");
		busNo = scanner.nextInt();
		//typeconvertion String to date
		System.out.println("Enter date dd-MM-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		//incase of if you didin't give correct formate it causr of parse Exception
		//so used in try catch block
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			System.out.println("ParseException is Handled");
		}
		
	}
	//using isAvailable() method cause of checking for availability 
	//for booking and it return true or false
	@Override
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		//to find a capacity of given busno
		int capacity = 0;
		for(Bus bus:buses) {
			// if condition is used purpose of checks 
		//the given busno is equals to current busno
			if(bus.getBusNo() == busNo)
				capacity = bus.getCapacity();
		}
		int booked = 0;
		for(Booking b:bookings) {
			// if condition is used purpose of checks 
			//the given busno and date is equals to current busno and date
			if(b.busNo == busNo && b.date.equals(date)) {
				booked++;
			}
		}
		// using ternary operator for the purpose of checks booked value
		//not more than capacity is true else it return false
		return booked<capacity?true:false;
	}
}
