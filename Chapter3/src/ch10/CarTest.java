package ch10;

public class CarTest {

	public static void main(String[] args) {
		Car aicar = new AICar();
		aicar.run();
		
		Car mCar = new ManualCar();
		mCar.run();
	}

}
