package ch04;

public class Studentclass {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		
		
		studentLee.studentId = 12345;
		studentLee.setStudentName("Lee");
		studentLee.address = "서울 강남구";
		
		
		studentLee.showStudentInfo();
		
		
		Student  studentKim = new Student();
		studentKim.studentId = 54321;
		studentKim.studentName = "kim";
		studentKim.address = "경기도 성남";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentKim);
		System.out.println(studentLee);
	}

}
