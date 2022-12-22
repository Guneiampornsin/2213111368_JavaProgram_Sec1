import java.util.*;;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		Student[] std = new Student[scan.nextInt()];
		System.out.println();
		for (int i = 0; i < std.length; i++) {
			std[i] = new Student();
			System.out.print("Input student name : ");
			std[i].setName(scan.next());
			System.out.print("Input student score: ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("Input student score, again : ");
				std[i].setScore(scan.nextInt());
			}//end While
			System.out.println("----------------------------------");
		}//end for 
		for(Student _std : std) {
			if(_std.isPass()) {
				System.out.println(">> "+_std.getName()+" get grade "+_std.findGrade());
			}
		}

	}
}
