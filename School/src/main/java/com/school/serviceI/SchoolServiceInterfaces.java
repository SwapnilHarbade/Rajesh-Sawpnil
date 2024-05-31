package com.school.serviceI;

import java.util.List;

import com.school.mode.School;

public interface SchoolServiceInterfaces {

	void updateSingleRecordId(int id, School school);

	void deleteSingleId(int id);

	School getOne(int id);

	void postAllData(School school);

	List<School> getAllData();

}
