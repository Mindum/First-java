package ch03;

public class VIPCustomer extends Customer{
	
	

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		// TODO Auto-generated constructor stub
	}


	double salesRatio;
	private String agentID;
	
	
	public VIPCustomer() {
	
		super(0,"no-name");
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("브이아이피커스터머 호출");
		
		
	}
	
	

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
				
	}
	
	
	public String getAgentID() {
		
		return agentID;
		
	}

}
