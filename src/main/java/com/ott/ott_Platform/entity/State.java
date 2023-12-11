package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.ott.ott_Platform.enums.Status;

@Entity
@Table(name="states")
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int id;
	    private String state_name;
	    private String state_code;
	    
	    @OneToOne
	    @JoinColumn(name="country_id")
	    private Country country_id;
	    private Status status;
	    private int created_by;
	    private int updated_by;
	    private Timestamp createdAt;
	    private Timestamp updatedAt;
	    private Timestamp deletedAt;

}
