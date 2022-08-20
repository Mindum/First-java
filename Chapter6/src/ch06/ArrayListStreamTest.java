package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("민준");
		sList.add("준호");
		sList.add("지화");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.println(s + "\t"));
		sList.stream().map(s->s.length()).forEach(s->System.out.println(s + "\t"));
		
	}

}