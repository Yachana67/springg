package com.ott.ott_Platform.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class Series {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	
	private String name;
	
	@OneToMany(mappedBy = "series")
    private List<Episodes> episodes;
//	
	private String description;
	
	private String director;
	
	@ElementCollection
    private List<String> starring;
	
	private String seasons;
}
