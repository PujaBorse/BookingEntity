package com.fujitsu.services;

import java.util.List;

import com.fujitsu.beans.booking.Booking;
import com.fujitsu.exception.ServiceException;



public interface BookingService {
	
	List<Booking> findAllBooking() throws ServiceException;
	Booking findByBookingId(int bookingId) throws ServiceException;
	void add(Booking booking) throws ServiceException;
	void update(Booking booking) throws ServiceException;
	void remove(Booking booking) throws ServiceException;
	
	List<Booking> sortBookingById() throws ServiceException;
	/*List<Booking> sortBookingByBookingDate() throws ServiceException;
	
	*/
}
