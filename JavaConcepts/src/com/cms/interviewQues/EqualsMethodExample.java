package com.cms.interviewQues;

public class EqualsMethodExample {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Chandra",1000);
		Employee e2 = new Employee(1,"Chandra",1000);
		boolean checkEqual= e1.equals(e2);
		System.out.println("checkEqual::"+checkEqual);

	}
	
	

}

class Employee{
	int id;
	String name;
	int salary;
	
	public Employee(int id, String name, int salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object o){
		System.out.println("Calling equals methods::");
		Employee e = (Employee)o;
		boolean status = false;
		if(e == null)
			status = false;
		if(!(o instanceof Employee))
			status = false;
		if(this.getId()==e.getId() && this.getName()==e.getName() && this.getSalary()==e.getSalary())
			status = true;
		return status;
		
	}
}
