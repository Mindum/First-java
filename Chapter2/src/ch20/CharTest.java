package ch20;

public class CharTest {

	public static void main(String[] args) {

		char[] alpha = new char[26];
		char ch = 'A';
		
		for(int i = 0 ; i < alpha.length;i++) {
			alpha[i] = ch++;
			
		}
		for(char  alph : alpha) {
			System.out.println( alph + "," + (int)alph);
		}
	}

}
