package com.ott.ott_Platform.entity;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Episodes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int id;
	private int episode_no;
	private String name;
	private String title;
	private String description;
	private Time duration;
	 @ManyToOne
	    @JoinColumn(name = "series_id")
	    private Series series;

}
