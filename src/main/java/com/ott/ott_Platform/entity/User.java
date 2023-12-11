package com.ott.ott_Platform.entity;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ott.ott_Platform.enums.ApprovalStatus;
import com.ott.ott_Platform.enums.Gender;
import com.ott.ott_Platform.enums.Status;
import com.ott.ott_Platform.enums.VerificationStatus;


@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
    private String email;
    private String phone;
    private String whatsapp_no;
    private String password;
    private Gender gender;  
    private String image;
    private String city;
    private String state;
    private String pin_code;
    @Enumerated(EnumType.STRING)
    private ApprovalStatus approval_status;
    private LocalDateTime approved_on;
    private int approved_by;
    private String admin_remark;
    private Status login_allowed;
    private Status otp_allowed;
    private Status password_allowed;
    private Status sms_notification;
    private Status email_notification;
    private Status fcm_notification;
    private Status whatsapp_notification;
    @Enumerated(EnumType.STRING)
    private VerificationStatus is_verified;
    @Enumerated(EnumType.STRING)
    private VerificationStatus fpwd_flag;
    private LocalDateTime last_login;
    private LocalDateTime email_verified_at;
    private String remember_token;
    @Enumerated(EnumType.ORDINAL)
    private Status status;
    private int created_by;
    private int updated_by;
    private Timestamp created_at;
    private Timestamp updated_at;
    private Timestamp deleted_at;
	
	
}
