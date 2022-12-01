import java.util.*;
import javax.swing.*;

public class Lab402 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			sentence = scan.nextLine();
		}
		for(int i=0;i<sentence.length();i++) {
			System.out.print(sentence.charAt(i));
			if (sentence.charAt(i) == ' ') {
				System.out.println();
			}	
		}

	}
}