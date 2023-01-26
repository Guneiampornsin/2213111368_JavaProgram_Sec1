import javax.swing.JOptionPane;
public class BookDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Input author name :");
		String email = JOptionPane.showInputDialog("Input author e-mail :");
		String title = JOptionPane.showInputDialog("Input book title");
		int page = Integer.parseInt(JOptionPane.showInputDialog("Input book page : "));
		int checkpage = JOptionPane.showConfirmDialog(null, "Is the page correct");
		Book_1 book = new Book_1(title,new Author_1(name,email),page);
		while(checkpage == 1) {
			page = Integer.parseInt(JOptionPane.showInputDialog("Input book page, again: "));
	
		}
		JOptionPane.showMessageDialog(null,
				"Book Title:"+ book.getTitle()+
				"\nAuthor name:"+ book.getAuthor().getName() +"("+ book.getPage()+" page)"+
				"\nAuthir e-mail:" + book.getAuthor().getEmail(),"Message",
				JOptionPane.INFORMATION_MESSAGE);
	}
}
