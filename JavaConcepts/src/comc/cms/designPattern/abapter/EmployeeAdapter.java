package comc.cms.designPattern.abapter;

import java.util.ArrayList;

public class EmployeeAdapter implements Itarget {
	
	ThirdPartyBillingSystem thirdPartyBillingSystem = new ThirdPartyBillingSystem();
	
	@Override
	public void processCompanySalary(String[][] employeeInfo) {
		String employeeId = null;
		String name = null;
		String designation = null;
		
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		for(int i=0; i< employeeInfo.length; i++){
			for(int j =0; j< employeeInfo[i].length; j++){
				if(j==0){
					employeeId = employeeInfo[i][j];
				}
				else if(j == 1){
					name = employeeInfo[i][j];
				}
				else if(j == 2){
					designation = employeeInfo[i][j];
				}
			}
			employeeList.add(new Employee(Integer.parseInt(employeeId), name, designation));
		}
		
		System.out.println("Adapter converted array of employee to  Array list of employee :\n"+ employeeList+"\n"+
		"Then deligate to the thirdpartyBillingsystem for processing the employee salary");
		
		thirdPartyBillingSystem.processSalary(employeeList);
	}
	
}
