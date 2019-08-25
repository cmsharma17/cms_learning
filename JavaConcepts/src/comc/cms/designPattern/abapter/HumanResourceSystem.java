package comc.cms.designPattern.abapter;

public class HumanResourceSystem {
	public static String[][] getEmployee(){
		String[][] employees = new String[4][];
		
		employees[0] = new String[] {"100", "Tavinder", "Team Lead"};
		employees[1] = new String[] {"100", "Chandra", "Developer"};
		employees[2] = new String[] {"100", "XYZ", "Tester"};
		employees[3] = new String[] {"100", "ABC", "Team Lead"};
		
		return employees;
	}
	
	public static void main(String[] args){
		Itarget target = new EmployeeAdapter();
		System.out.println("HR System process Employee strign array to adapter\n");
		target.processCompanySalary(getEmployee());
	}
}
