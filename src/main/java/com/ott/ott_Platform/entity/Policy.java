package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ott.ott_Platform.enums.policyType;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private policyType type;
	private int created_by;
	private int updated_by;
	
	
	private Timestamp deleted_at;
	private Timestamp created_at;
	private Timestamp updated_at;
}
