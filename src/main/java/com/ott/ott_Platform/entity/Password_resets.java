package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Password_resets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
    private String email;
    private String token;
    private Timestamp created_at;
    private Timestamp updated_at;
}
