package ch02;

public class EqualsTest {

	public static void main(String[] args) {

		
		Stdent std1 = new Stdent(100,"Lee");
		Stdent std2 = new Stdent(100,"Lee");
		
		System.out.println(std1==std2);
	}

}
