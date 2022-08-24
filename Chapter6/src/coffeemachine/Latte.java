package coffeemachine;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
	}
	public void brewing() {
		super.brewing();
		System.out.println("우유 추가");
	}

}
