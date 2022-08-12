package ch16;

public class Employee {

	
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	private String department;
	
	
	
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}
	public static int getSerialNum() {
		
		int i = 0;
		employeeName = "Lee";
		return serialNum;
	}

	
	
	public int getEmployeeId() {
		serialNum = 1000;
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Sring getDepartment() {
		return department;
	}
	public void setDepartment(Sring department) {
		this.department = department;
	}
}
