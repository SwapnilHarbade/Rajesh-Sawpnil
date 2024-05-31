package com.school.mode;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

@Data
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sch_id;
	private String sch_name;
	
}
