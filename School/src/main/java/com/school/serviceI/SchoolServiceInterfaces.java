package com.school.serviceI;

import java.util.List;

import com.school.mode.School;

public interface SchoolServiceInterfaces {

	School getOne(int id);

	void postAllData(School school);

	List<School> getAllData();

}
