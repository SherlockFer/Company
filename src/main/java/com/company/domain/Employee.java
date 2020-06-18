package com.company.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	private String firstName;

	private String lastName;

	private String officeNumber;

	private String officePhone;

	private LocalDate joinDate;

	@OneToMany
	@JoinColumn(name = "SUPERVISOR_ID")
	private Employee supervisorId;

}
