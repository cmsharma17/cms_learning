package com.cms.basicConcepts.cloneing;

public class Employee implements Cloneable {
	String ename;
	String empId;
	Department dept;
	public Employee(String ename, String empId, Department dept) {
		this.ename = ename;
		this.empId = empId;
		this.dept = dept;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
