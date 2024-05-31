package com.school.mode;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity

@Data
public class School {

	private int sch_id;
	private String sch_name;
	
}
