package com.indrajeet.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employess")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "email")
	private String email;
	@Column(name = "DOB")
	private String DOB;
	@Column(name = "age")
	private int age;
	@Column(name = "salary")
	private float salary;
	@Column(name = "status")
	private boolean isstatus=false;

	public Employee() {
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isIsstatus() {
		return isstatus;
	}

	public void setIsstatus(boolean isstatus) {
		this.isstatus = isstatus;
	}



	public Employee(long id, String firstName, String email, String DOB, int age, float salary, boolean isstatus) {
		this.id = id;
		this.firstName = firstName;
		this.email = email;
		this.DOB = DOB;
		this.age = age;
		this.salary = salary;
		this.isstatus = isstatus;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", email='" + email + '\'' +
				", DOB='" + DOB + '\'' +
				", isstatus=" + isstatus +
				", age=" + age +
				", salary=" + salary +
				'}';
	}
}
