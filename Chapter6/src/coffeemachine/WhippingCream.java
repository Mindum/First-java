package coffeemachine;

public class WhippingCream extends Decorator{

	public WhippingCream(Coffee coffee) {
		super(coffee);
	}
	
	
	public void brewing() {
		super.brewing();
		System.out.println("휘핑크림 추가");
	}


}
