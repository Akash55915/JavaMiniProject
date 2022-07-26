package com.cybage.model;

public class Feedback {
	
 private int rating_id;
 private  int rating_rating;
 private String description ;
 private int booking_id;

 public Feedback() {
	super();
	// TODO Auto-generated constructor stub
 }

public Feedback(int rating_rating, String description, int booking_id) {
	super();
	this.rating_rating = rating_rating;
	this.description = description;
	this.booking_id = booking_id;
}

public Feedback(int rating_id, int rating_rating, String description, int booking_id) {
	super();
	this.rating_id = rating_id;
	this.rating_rating = rating_rating;
	this.description = description;
	this.booking_id = booking_id;
}

public int getRating_id() {
	return rating_id;
}

public void setRating_id(int rating_id) {
	this.rating_id = rating_id;
}

public int getRating_rating() {
	return rating_rating;
}

public void setRating_rating(int rating_rating) {
	this.rating_rating = rating_rating;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public int getBooking_id() {
	return booking_id;
}

public void setBooking_id(int booking_id) {
	this.booking_id = booking_id;
}

@Override
public String toString() {
	return "Feedback [rating_id=" + rating_id + ", rating_rating=" + rating_rating + ", description=" + description
			+ ", booking_id=" + booking_id + "]";
}
 
 

}
