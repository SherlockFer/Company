package com.company.domain;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
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
@Table(name = "EMPLOYEE_INFO")
public class EmployeeInfo {

	@Id
	@GeneratedValue
	@JoinColumn(name = "ID")
	private Integer employee_id;

	private LocalDate activeDate;

	private String salary;

	private String homeAddress;

	private String title;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ID")
	private Set<Employee> employes;
}
