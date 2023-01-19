import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Book book = new Book();
		System.out.print("input book title      :");
		book.setTitle(scan.nextLine());
		System.out.print("input book price      :");
		book.setPrice(scan.nextFloat());
		System.out.print("input publish year    :");
		book.setPublishyear(scan.nextInt());
		
		System.out.println();
		System.out.println(book);
	}
}
