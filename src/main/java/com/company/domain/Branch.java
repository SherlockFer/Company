package com.company.domain;

import java.util.Set;

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
@Table(name = "BRANCH")
public class Branch {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;

	private String name;

	private String country;

	private String state;

	private String street;

	private String zip;

	private String phone;

	@OneToMany
	@JoinColumn(name = "branch_id")
	private Set<Employee> employees;

}
