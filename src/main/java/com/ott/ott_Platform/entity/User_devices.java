package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User_devices {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	
	  @OneToOne
	  @JoinColumn(name="user_id")
	   private User user_id;
	    private String fcm_id;
	    private String uuid;
	    private String platform;
	    private String refresh_token;
	    private String remember_token;
	    private Timestamp deleted_at;
	    private Timestamp created_at;
	    private Timestamp updated_at;
}
