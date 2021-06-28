package com.example.demo.app.survey;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "survey")
public class SurveyForm {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Min(0)
	@Max(150)
	private int age;
	
	@Min(1)
	@Max(5)
	private int satisfaction;
	
	@NotNull
	@Size(min = 1, max = 200, message = "Please enter between 1-200 characters")
	private String comment;
	
	public SurveyForm() {}
	
	public SurveyForm(@Min(0) @Max(150) int age, @Min(1) @Max(5) int satisfaction,
			@NotNull @Size(min = 1, max = 200, message = "Please enter between 1-200 characters") String comment) {
		super();
		this.age = age;
		this.satisfaction = satisfaction;
		this.comment = comment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSatisfaction() {
		return satisfaction;
	}

	public void setSatisfaction(int satisfaction) {
		this.satisfaction = satisfaction;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
