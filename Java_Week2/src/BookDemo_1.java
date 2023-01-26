import java.util.*;
public class BookDemo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.print("Input author name :");
		String name = scan.nextLine();
		System.out.print("Input authir e-mail :");
		String email = scan.next();
		
		Author_1 at = new Author_1(name,email);
		System.out.println(at);
		
		System.out.print("Input book title");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("Input book page : ");
		int page = scan.nextInt();
		
		Book_1 book = new Book_1(title , at , page);
		System.out.println(book);
		
	}

}
