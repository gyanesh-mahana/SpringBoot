package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Variable names, getter setter names, Table column names and JSP element names
 * should match for Spring to work in default way
 */

@Entity
public class Employee {

	@Id
	private int eid;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesig() {
		return edesig;
	}

	public void setEdesig(String edesig) {
		this.edesig = edesig;
	}

	private String ename;
	private String edesig;

	public String toString() {
		return String.format("Employee data: {id:%d, name:%s, desig:%s}", getEid(), getEname(), getEdesig());
	}

}
