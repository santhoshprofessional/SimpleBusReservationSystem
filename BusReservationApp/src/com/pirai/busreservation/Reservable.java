package com.pirai.busreservation;

import java.util.ArrayList;
/* @author  santhosh
 * @version 14-11-2023
 * @code    Java Program for Bus Reservation System
 */
//Reservable is interface used to check availability
public interface Reservable {
    boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses);
}
