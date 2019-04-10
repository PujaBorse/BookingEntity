package com.fujitsu.beans.booking;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;




@Component
@Entity
@Table(name="BOOKDemo")

public class Booking implements Serializable, Comparable<Booking>
{
	@Id
	@GeneratedValue(generator="increment")
	private int bookingId;
	/*private Date bookingdate;*/
	private Date checkInDate;
	private Date checkOutDate;
	@Column(length=50 )
	private String checkInTime;
	@Column(length=50)
	private String checkOutTime;
	private int numberOfRooms;
	private int noOfAdults;
	private int noOfChildren;
	
	
	/*@OneToOne(cascade=CascadeType.ALL)*/
	/*@JoinColumn(name="hotelId")
	private Hotel hotelId;*/
	
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	/*public Date getBookingdate() {
		return bookingdate;
	}

	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}*/

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getNoOfAdults() {
		return noOfAdults;
	}

	public void setNoOfAdults(int noOfAdults) {
		this.noOfAdults = noOfAdults;
	}

	public int getNoOfChildren() {
		return noOfChildren;
	}

	public void setNoOfChildren(int noOfChildren) {
		this.noOfChildren = noOfChildren;
	}



	@Override
	public int compareTo(Booking o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId +  ", checkInDate=" + checkInDate
				+ ", checkOutDate=" + checkOutDate + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime
				+ ", numberOfRooms=" + numberOfRooms + ", noOfAdults=" + noOfAdults + ", noOfChildren=" + noOfChildren
				+  "]";
	}
	
	


	

	
	
}
 