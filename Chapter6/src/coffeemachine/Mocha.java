package coffeemachine;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	
	public void brewing() {
		super.brewing();
		System.out.println("모카시럽 추가");
	}

}
