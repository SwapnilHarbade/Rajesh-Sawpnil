package com.school.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.school.mode.School;

@Repository
public interface SchoolRepository extends CrudRepository<School, Integer> {

}
