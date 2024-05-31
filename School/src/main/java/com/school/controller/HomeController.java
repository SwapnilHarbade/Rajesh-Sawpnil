package com.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.mode.School;
import com.school.serviceI.SchoolServiceInterfaces;



@RestController
public class HomeController {
	
	@Autowired SchoolServiceInterfaces ssi;
	
	@GetMapping("/getone/{id}")
	public School getOne(@PathVariable int id) {

		School sc = ssi.getOne(id);
		return sc;
	}

	@PostMapping("/post")
	public String postMethodName(@RequestBody School school) {
		ssi.postAllData(school);
		return "Inserted data SuccessFully.!!";
		
	}
	
	@GetMapping("/getdata")
	public List<School> getAllUser() {
		
		List<School> list=ssi.getAllData();
		
		return list;
	}

	
}
