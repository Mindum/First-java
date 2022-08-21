package ch07;

import java.util.Arrays;

public class ReduceTest {

	public static void main(String[] args) {

		
		String greetings[] = {"ddddddd", " asdfasdfa", " foofoefajsndfj "	};
		
		Arrays.stream(greetings).reduce("",(s1,s2)->{
			if(s1.getBytes().length>= s2.getBytes().length)return s1;
			else return s2;}
		)

}
