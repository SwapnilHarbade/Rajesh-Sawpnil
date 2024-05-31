package com.school.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.repository.SchoolRepository;
import com.school.serviceI.SchoolServiceInterfaces;

@Service
public class SchoolServiceImp implements SchoolServiceInterfaces{
	
	@Autowired SchoolRepository schoolRepository;

}
