package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User_reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	  
	 @OneToOne
	 @JoinColumn(name="movie_id")
	 private Movie movie;
	    
	    private int rating;
	    private String review;
	    private int updated_by;
	    private int created_by;
	    private Timestamp created_at;
	    private Timestamp updated_at;
}
