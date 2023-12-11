package com.ott.ott_Platform.entity;

import java.sql.Timestamp;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.ott.ott_Platform.enums.Status;
import com.ott.ott_Platform.enums.VerificationStatus;

@Entity
@Table(name="movies")
public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	 private int id;
	
	   @OneToOne
	   @JoinColumn(name = "movie_category_id")
	    private Movie_Category movie_category_id;
	   
	   
	    private String name;
	    private String description;
	    private Timestamp time;
	 
	    private int sequence;
	    private int amount;
	    private int tax;
	    private int serviceCharge;
	    private int total;
	    
	 
	
	    @Enumerated(EnumType.ORDINAL)
	    private Status status;
	   
	    @Enumerated(EnumType.STRING)
	    private VerificationStatus visible_in_app;
	    private int created_by;
	    private int updated_by;
	    private Timestamp created_at;
	    private Timestamp updated_at;
	    private Timestamp deleted_at;

}
