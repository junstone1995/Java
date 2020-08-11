package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName ="홍길동";
		studentLee.address = "서울";
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentName = "James";
		studentKim.address = "Newyork";
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
