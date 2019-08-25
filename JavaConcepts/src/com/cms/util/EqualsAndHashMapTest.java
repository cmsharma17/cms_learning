package com.cms.util;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsAndHashMapTest {

	public static void main(String[] args) {
		EmployeeNw e1 = new EmployeeNw();
		EmployeeNw e2 = new EmployeeNw();
 
        e1.setId(100);
        e2.setId(100);
 
        //Prints false in console without equals method implementation
        System.out.println(e1.equals(e2));
        System.out.println("e1 obj hashCode--"+e1.hashCode());
        System.out.println("e2 obj hashCode--"+e2.hashCode());
        Set<EmployeeNw> employees = new HashSet<EmployeeNw>();
        employees.add(e1);
        employees.add(e2);
        
        System.out.println(employees);
        
        
	}

}

class EmployeeNw{
	private Integer id;
    private String firstname;
    private String lastName;
    private String department;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public boolean equals(Object o){
		System.out.println("Calling equals methods::");
		EmployeeNw e = (EmployeeNw) o;
		return (this.getId()== e.getId());
	}
	
	@Override
	public int hashCode(){
		/*final int PRIME = 31;
	    int result = 1;
	    result = PRIME * result + getId().hashCode();
	    return result; */
	    
	    return Objects.hash(id, firstname, lastName, department);
	    
	    //For JDK 7 and above, you can use the new Objects class to generate the equals and hash code values.
	}
	
    	
}
