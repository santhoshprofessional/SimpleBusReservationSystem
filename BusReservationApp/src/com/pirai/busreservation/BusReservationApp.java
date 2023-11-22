package com.pirai.busreservation;

import java.util.*;
/* @author  santhosh
 * @version 14-11-2023
 * @code    Java Program for Bus Reservation System
 */
public class BusReservationApp {

	public static void main(String[] args) {
		
		//@ArrayList - collection Because wants to create many object creation
		ArrayList<Bus> buses= new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		//For creating Bus objects and into add ArrayList
		buses.add(new Bus(1,true,1,"covaitochennai"));
		buses.add(new Bus(2,false,2,"covaitopollachi"));
		buses.add(new Bus(3,true,13,"covaitomadurai"));
		buses.add(new Bus(4,true,15,"covaitopondy"));
		buses.add(new Bus(5,false,20,"covaitopalani"));
		
		 int option = 1,choice=1;
			Scanner scanner = new Scanner(System.in);
			// For Each loop using to access to ArrayList objects
			System.out.println("Enter 1 to Display bus details and 2 to exit");
			choice = scanner.nextInt();
			if(choice == 1) {
				for(Bus b:buses) {
					b.displayBusInfo();
				}
			}
		while(option == 1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			option = scanner.nextInt();
			if(option == 1) {
				//creating object of Booking class
				Booking booking = new Booking();
				//using isAvailable() method cause of checking for availability 
				//it return true or false
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your bus ticket Booking has been confirmed.");
					System.out.println("Enjoy your journey safe.");
					System.out.println("Thank you for using BusReservation.");
				}
				else {
					System.out.println("Sorry!");
					System.out.println("Bus is full");
					System.out.println("Try another bus or date");
				}
			}
			else {
				System.out.println("Thank you for visiting.");
			}
		}
	}

}
