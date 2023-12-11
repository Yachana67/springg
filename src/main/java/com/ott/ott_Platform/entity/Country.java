package com.ott.ott_Platform.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ott.ott_Platform.enums.Status;



@Entity
@Table(name="countries")
public class Country {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	  private int id;
	    private String country_name;
	    private String country_code;
	    
	    @Enumerated(EnumType.ORDINAL)
	    private Status status;
	    private int created_by;
	    private int updated_by;
	    private Timestamp created_at;
	    private Timestamp updated_at;
	    private Timestamp deleted_at;
	    
	    
}
