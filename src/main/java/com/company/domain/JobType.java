package com.company.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

@Entity
@Table(name = "JOB_TYPE")
public class JobType {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	private String title;

	private String description;

	private String complexity;

}
