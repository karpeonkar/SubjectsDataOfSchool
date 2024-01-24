package com.xadsmin.SpringBootCrud.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadsmin.SpringBootCrud.bean.Subject;
import com.xadsmin.SpringBootCrud.repository.SubjectRepository;

@Service
public class SubjectService {
	@Autowired
	public SubjectRepository subjectRepo;
 
	public List<Subject> getAllSubjects()
	{
		List<Subject> subjects=new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}

	public void addSubject(Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}

	public void updateSubject(String id, Subject subject) {
		// TODO Auto-generated method stub
		subjectRepo.save(subject);
		
	}

	public void deleteSubject(String id) {
		// TODO Auto-generated method stub
		subjectRepo.deleteById(id);
	}
}
