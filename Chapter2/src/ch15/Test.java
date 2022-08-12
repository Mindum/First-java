package ch15;

public class Test {

	public static void main(String[] args) {
		   
		
		person personI = new person("Edward", 20000);
		Taxi taxi  = new Taxi("잘 간다 운수택시", 0);
		
		
		personI.takeTaxi(taxi);
		
		
		personI.showInfo();
		taxi.showTaxiInfo();
	}

}
