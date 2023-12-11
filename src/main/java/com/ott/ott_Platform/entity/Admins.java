package com.ott.ott_Platform.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.ott.ott_Platform.enums.Status;



@Entity
public class Admins {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String admin_name;
	private String nick_name;
	
	@Column(unique = true)
	private String email;
	
	@OneToOne
	@JoinColumn(name="role_id")
	private Role role;
	
	@OneToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
	private String phone;
	private String password;
	private String address;
	
	@Enumerated(EnumType.ORDINAL)
	private Status is_head;
	@Enumerated(EnumType.ORDINAL)
	private Status on_leave;
	@Enumerated(EnumType.ORDINAL)
	private Status login_allowed;
	
	@Enumerated(EnumType.ORDINAL)
	private Status status;
	@Enumerated(EnumType.ORDINAL)
	private Status sms_notification;
	@Enumerated(EnumType.ORDINAL)
	private Status email_notification;
	@Enumerated(EnumType.ORDINAL)
	private Status whatsapp_notification;
	@Enumerated(EnumType.ORDINAL)
	private Status force_pwd_change_flag;
	
	private Date pwd_expiry_date;
	
	private int created_by;
	private int updated_by;
	
	
	private Timestamp deleted_at;
	private Timestamp created_at;
	private Timestamp updated_at;
	

}
