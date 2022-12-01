import java.util.*;
import javax.swing.*;

public class Lab403 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		Message = Message.toLowerCase();
		if (Message.indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence ");
		}
		else System.out.print(Message);
	}

}