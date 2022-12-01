import java.util.*;
import javax.swing.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name : ");
		String inputName = scan.nextLine();
		int spaceFullname = inputName.indexOf(' ',0);
		if (spaceFullname == -1) {
			System.out.print("Incorrect Name");
		}
		else {
			String firstname = inputName.substring(0,spaceFullname);
			String lastname = inputName.substring(spaceFullname+1);
			System.out.print("First Name : " + firstname.toUpperCase() +
			         "\nLast Name : " + lastname.toLowerCase()   );
		}
	}
}

