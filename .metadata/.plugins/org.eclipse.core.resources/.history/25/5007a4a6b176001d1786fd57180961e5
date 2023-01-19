import java.util.*;

public class Lab504 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Plase enter your name, separated by a space. \n: ");
		String fullName = scan.nextLine();
		//int spaceFullname = fullName.indexOf(' ',0);
		//String firstName = fullName.substring(0,spaceFullname);
		System.out.print(abbreviatName(fullName));
	}
	
	public static String abbreviatName(String fullName) {
		//int spaceFullname = fullName.indexOf(' ',0);
		//if (spaceFullname ==  ' ') {
		//for(int i=0;i<fullName.length();i++) {
			//if(fullName.charAt(i)==' ') {
		String[] split = fullName.split(" ");
		return split[1].toUpperCase().charAt(0)+"."
				+split[2].toUpperCase().charAt(0)+"."+split[0];
	}

}
