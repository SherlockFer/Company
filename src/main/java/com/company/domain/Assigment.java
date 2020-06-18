package com.company.domain;

import java.time.LocalDate;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "ASSIGMENT")
public class Assigment {

	@EmbeddedId
	private AssigmentId id;

	@ManyToOne
	@MapsId("jobType_id")
	@JoinColumn(name = "jobType_id")
	JobType jobtype;

	@ManyToOne
	@MapsId("employee_id")
	@JoinColumn(name = "employee_id")
	Employee employee;

	private String title;

	private String description;

	private LocalDate startDate;

	private LocalDate stopDate;

}
