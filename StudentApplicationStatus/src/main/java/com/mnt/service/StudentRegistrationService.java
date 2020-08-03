package com.mnt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mnt.IService.IStudentRegistrationService;
import com.mnt.model.Student;
import com.mnt.repo.StudentRegistrationRepo;


public class StudentRegistrationService implements IStudentRegistrationService
{
	@Autowired
	private StudentRegistrationRepo repo;

	@Override
	public Integer insertStudentDetails(Student student) {
		Student st=repo.save(student);
		 if(st!=null)
		 {
			 Integer id=st.getId();
			 return id;
		 }
		return null;
	}

	@Override
	public List<Student> getStudentRegistrationDetails() {
		List<Student> list=repo.findAll();
		return list;
	}

	@Override
	public Student getOneStudentDetailsById(Integer id) {
		Optional<Student> opt=repo.findById(id);
		if(opt.isPresent())
		{
			return opt.get();
		}
		return null;
	}
  
}
