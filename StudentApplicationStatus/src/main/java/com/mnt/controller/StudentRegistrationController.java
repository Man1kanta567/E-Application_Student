package com.mnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mnt.IService.IStudentRegistrationService;
import com.mnt.model.Student;

@Controller
public class StudentRegistrationController 
{
	
	@Autowired
	private IStudentRegistrationService service;
	
   @RequestMapping("/demo")
   @ResponseBody
   public String getResponseBodyDemo()
   {
	   return "this is a sample demo for the controller";
   }
   
	/* STUDENT REGISTRATION FORM */
   @GetMapping("/register")
   public String getStudentRegister(Model model)
   {
	   model.addAttribute("student", new Student());
	   return "StudentRegistration";
   }
   
   @PostMapping("/registerSuccess")
   public String getStudentRegisterSuccess(@ModelAttribute("student") Student student,Model model)
   {
	  Integer id= service.insertStudentDetails(student);
	  String message="Student is registered with id::"+id;
	   model.addAttribute("student", new Student());
	   model.addAttribute("msg",message);
	   return "StudentRegistration";
   }
   
   @GetMapping("/result")
   public String getOneStudentDetailsById(Model model)
   {
	  List<Student> list= service.getStudentRegistrationDetails();
      model.addAttribute("list", list); 
	  return "StudentDetails";
   }
  
}
