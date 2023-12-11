package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	  private int id;
	    private String name;
	    
	    @Column(unique = true)
	    private String email;
	    private String message;
	    private Timestamp created_at;
	    private Timestamp updated_at;
	    private Timestamp deleted_at;
}
