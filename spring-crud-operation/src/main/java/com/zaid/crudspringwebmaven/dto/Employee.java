package com.zaid.crudspringwebmaven.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.ToString;
@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto",strategy="increment")
	private int id;
	private String name;
	private float salary;
	private String designation;

}
