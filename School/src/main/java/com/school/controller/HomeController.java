package com.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.school.serviceI.SchoolServiceInterfaces;


@RestController
public class HomeController {
	
	@Autowired SchoolServiceInterfaces ssi;
	
}
