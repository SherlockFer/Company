package com.company.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
class AssigmentId implements Serializable {

	@Column(name = "jobType_id")
	Long jobTypeId;

	@Column(name = "Employee_id")
	Long employeeId;

}