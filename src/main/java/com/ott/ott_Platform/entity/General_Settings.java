package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.ott.ott_Platform.enums.Status;

@Entity
public class General_Settings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
    private String type;
    private String value;
    private int created_by;
    private int updated_by;
    private Status status;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Timestamp deleted_at;
}
