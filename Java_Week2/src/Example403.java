import java.util.*;
import javax.swing.*;

public class Example403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	Scanner scan = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scan.nextLine();
		}
		System.out.println();
		int countofSpace = 0;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				countofSpace++;
			}	
		}
		System.out.println("This sentence has" + countofSpace+ " Spacebar.");
		System.out.println("This sentence has" + (countofSpace+1)+ " word.");
		*/
		
		String inputSentence = JOptionPane.showInputDialog("Input a sentence: ");
		while(!inputSentence.endsWith(".")) {
			inputSentence = JOptionPane.showInputDialog("Input a sentence,again: ");
		}
		int countofSpace = 0;
		for(int i=0;i<inputSentence.length();i++) {
			if(inputSentence.charAt(i)==' ') {
				countofSpace++;
			}
		}
		JOptionPane.showMessageDialog(null, 
				"This sentence has " + countofSpace+ " Spacebar."+
				"\nThis sentence has " + (countofSpace+1)+ " word.");
	}
}
