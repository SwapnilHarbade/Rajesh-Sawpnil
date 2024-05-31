package com.school.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.mode.School;
import com.school.repository.SchoolRepository;
import com.school.serviceI.SchoolServiceInterfaces;

@Service
public class SchoolServiceImp implements SchoolServiceInterfaces{
	
	@Autowired SchoolRepository schoolRepository;

	@Override
	public void updateSingleRecordId(int id, School school) {
		
		schoolRepository.findById(id);
	}

	@Override
	public void deleteSingleId(int id) {
	
		schoolRepository.deleteById(id);
	}

}
