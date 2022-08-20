package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		
		String s1 = "Hello";
		String s2 = "world";
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2);
		
		StringConcat concat  = (s1,s2)->System.out.println(s1  + s2);
	}

}
