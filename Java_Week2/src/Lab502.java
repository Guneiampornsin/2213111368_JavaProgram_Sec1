import javax.swing.*;

public class Lab502 {
	static String email;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inputEmail(); //call inputEmail method , method is not return medthod
		
	}
	
	public static void inputEmail() {
		String ans = "";
		do {
		email = JOptionPane.showInputDialog("input your emai: ");
		checkEmailError(email);
		ans = JOptionPane.showInputDialog("Continue[y||Y to Continue] : ");
		}while(ans.equalsIgnoreCase("y"));
	}
	public static void checkEmailError (String chkEmail) {
		while(chkEmail.startsWith("@")||chkEmail.contains("")) {
			chkEmail = JOptionPane.showInputDialog("Input your e-mail: ");
		}
		chkEmail=chkEmail.toLowerCase();
		boolean checkEmail = chkEmail.endsWith("@gmail.com")||chkEmail.endsWith("@hotmail.com");
		JOptionPane.showMessageDialog(null, (checkEmail)
				?"Your e-mail is + inputEmail"
				:"Your e-mail is not hotmail or gmail dot com");
		
	}

}
