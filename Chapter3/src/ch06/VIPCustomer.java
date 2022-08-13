package ch06;

public class VIPCustomer extends Customer{
	
	
	
	double salesRatio;
	private String agentID;
	
	

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
	}

	/*public VIPCustomer() {
	
		super(0,"no-name");
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
		
		System.out.println("브이아이피커스터머 호출");
		
		
	}*/
	
	

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
				
	}
	
	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price * bonusRatio;
		price -=   (int)(price * salesRatio);
		
		return price;
	}

	public String getAgentID() {
		
		return agentID;
		
	}
}
