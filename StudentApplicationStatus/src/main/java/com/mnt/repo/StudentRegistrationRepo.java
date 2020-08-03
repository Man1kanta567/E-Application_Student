package com.mnt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mnt.model.Student;

public interface StudentRegistrationRepo extends JpaRepository<Student, Integer>{

}
