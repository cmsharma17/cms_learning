package comc.cms.designPattern.singleton;

final class Employee {
	private static Employee obj = null;	
	
	private Employee(){
	}
	
	public final static Employee getInstance(){
		if(obj == null){
			synchronized(Employee.class){
				if(obj == null){
					obj =  new Employee();
				}
			}
		}
		return obj;
	}
}
