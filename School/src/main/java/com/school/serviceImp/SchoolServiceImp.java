package com.school.serviceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.mode.School;
import com.school.repository.SchoolRepository;
import com.school.serviceI.SchoolServiceInterfaces;


@Service
public class SchoolServiceImp implements SchoolServiceInterfaces{
	
	@Autowired SchoolRepository sr;

	@Override
	public School getOne(int id) {
		Optional<School> op=sr.findById(id);
		if(op.isPresent())
		{
			School u=op.get();
			return u;
		}
		else
		{
		return null;
		}
	}
	

	@Override
	public void postAllData(School school) {
	
		sr.save(school);
		
	}

	@Override
	public List<School> getAllData() {
		return (List<School>) sr.findAll();
	}

	@Override
	public void updateSingleRecordId(int id, School school) {
		
		sr.findById(id);
	}

	@Override
	public void deleteSingleId(int id) {
	
		sr.deleteById(id);
	}

}
