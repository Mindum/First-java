package ch02;

public class Customer {

	
	protected int coutomerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	
	
	String agentID;
	double saleRatio;
	
	public Customer()
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	
	public int getCoutomerId() {
		return coutomerId;
	}

	public void setCoutomerId(int coutomerId) {
		this.coutomerId = coutomerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는"  + bonusPoint + "입니다";
	}
	
}
