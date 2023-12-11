package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ott.ott_Platform.enums.Status;
@Entity
@Table(name="movie_categories")
public class Movie_Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
private int id;
private Status status;
private int sequence;
private int created_by;
private int updated_by;


private Timestamp deleted_at;
private Timestamp created_at;
private Timestamp updated_at;
}
