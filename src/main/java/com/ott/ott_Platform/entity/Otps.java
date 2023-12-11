package com.ott.ott_Platform.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="otps")
public class Otps {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String mobile_no;

	    private String mobile_no_with_code;

	    private String otp_code;

	    private Timestamp expiry_time;

	    private String work_flow;

	    private int verify_count;

	    private String otp_verified;

	    private Timestamp created_at;

	    private Timestamp updated_at;

	    private Timestamp deleted_at;

}
