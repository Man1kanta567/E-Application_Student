package com.mnt.IService;

import java.util.List;

import com.mnt.model.Student;

public interface IStudentRegistrationService
{
   public Integer insertStudentDetails(Student student);
   
   public List<Student> getStudentRegistrationDetails();
   
   public Student getOneStudentDetailsById(Integer id);
}
