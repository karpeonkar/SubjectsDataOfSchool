package com.xadsmin.SpringBootCrud.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.xadsmin.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends JpaRepository<Subject, String> {

	List<Subject> findAll();

	 @SuppressWarnings("unchecked")
	Subject save(Subject subject);

	void deleteById(String id);

}
