import javax.swing.*;

public class Example402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		while(inputEmail.startsWith("@")||inputEmail.contains("")) {
			inputEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		}
		inputEmail=inputEmail.toLowerCase();
		/*
		if(inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com")) {
			JOptionPane.showConfirmDialog(null, "Your e=mail is "+inputEmail);
		}
		else {
			JOptionPane.showConfirmDialog(null, "Your e=mail is not hotmail or gmail dot com");
		}
		*/
		boolean checkEmail = inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkEmail)
				?"Your e-mail is + inputEmail"
				:"Your e-mail is not hotmail or gmail dot com");
		
	}

}
