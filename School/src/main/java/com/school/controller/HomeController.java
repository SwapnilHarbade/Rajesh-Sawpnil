package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.school.mode.School;
import com.school.serviceI.SchoolServiceInterfaces;


@RestController
public class HomeController {
	
	@Autowired SchoolServiceInterfaces ssi;
	
	@PutMapping("/updateSingleData/{id}")
	public String updateSingleData(@PathVariable int id, @RequestBody School school)
	{
		ssi.updateSingleRecordId(id, school);
		return "Update School Record in Successfully..!!" + id;
	}
	
	@DeleteMapping("/deleteSingleData/{id}")
	public String deleteSingleData(@PathVariable int id)
	{
		ssi.deleteSingleId(id);
		return "Delete School Record in Successfully..!!" + id;
		
		
	}
}
