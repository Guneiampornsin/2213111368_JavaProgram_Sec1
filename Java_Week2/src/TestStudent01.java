import java.util.*;
public class TestStudent01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student_1 std1 = new Student_1("AnupPap Jaising","I happy Ave");
		System.out.println(std1);
		
		std1.setAddress("25 Pattanakarn");
		System.out.println(std1);
		System.out.println(std1.getName());
		System.out.println(std1.getAddress());
		
		std1.addCourseGrade("INT107",87);
		std1.addCourseGrade("INT108",81);
		std1.addCourseGrade("MSC-202",92);
		std1.printGrades();
		
		
		System.out.printf("\nThe average grade is %.2f%n", std1.getAverageGrade() );
	}

}
