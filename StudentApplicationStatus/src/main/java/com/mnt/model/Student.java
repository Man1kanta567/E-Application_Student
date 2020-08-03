package com.mnt.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column(name="student_name_col")
	private String studentname;
	@Column(name="mail_col")
	private String mail;
	@Column(name="age_col")
	private String age;
	@Column(name="dob_col")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name="gender_col")
	private String gender;
	@Column(name="branch_col")
	private String branch;
	@Column(name="address_col")
	private String address;

}
