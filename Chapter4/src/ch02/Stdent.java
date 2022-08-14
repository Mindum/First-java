package ch02;

public class Stdent {

	
	private int studentNum;
	private String studentName;
	
	public Stdent(int studentNum, String studentName) {
		this.studentName = studentName;
		this.studentNum = studentNum;
	}
	
	public String toString() {
		return studentNum + studentName;
	}
}
