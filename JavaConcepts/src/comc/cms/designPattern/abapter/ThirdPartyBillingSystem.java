package comc.cms.designPattern.abapter;

import java.util.List;

public class ThirdPartyBillingSystem {
	public void processSalary(List<Employee> employeeList){
		for(Employee employee : employeeList){
			if(employee.getDesignation().equals("Team Lead"))
				System.out.println("Rs 700000 is credited to " +employee.getName() +"Account");
			else if(employee.getDesignation().equals("Developer"))
				System.out.println("Rs 400000 is credited to " +employee.getName() +"Account");
			else if(employee.getDesignation().equals("Tester"))
				System.out.println("Rs 300000 is credited to " +employee.getName() +"Account");
		}
	}
}
