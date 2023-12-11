package com.ott.ott_Platform.entity;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.ott.ott_Platform.enums.Status;

@Entity
@Table(name="roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	  private int id;
	    private String roleName;
	    @OneToMany(mappedBy = "role")
	    private List<Permissions> permissions;

	    private Status status;
	    private int created_by;
	    private int updated_by;
	    private Timestamp deleted_at;
	    private Timestamp created_at;
	    private Timestamp updated_at;

}
