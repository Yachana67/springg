package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ott.ott_Platform.enums.Status;

@Entity
public class Permissions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	 private int id;
	    private String name;
	    private String codename;
	    private String parent_status;
	    private String description;
	    
	    @ManyToOne
	    @JoinColumn(name = "role_id")
	    private Role role;
	    private Status status;
	    private Timestamp created_at;
	    private Timestamp updated_at;

}
