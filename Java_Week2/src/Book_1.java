public class Book_1 {

	private String title;
	private Author_1 author;
	private int page;

	public Book_1(String title, Author_1 author, int page) {
		this.title = title;
		this.author = author;
		this.page = page;
		// this(title,author,page;
	}

	public Book_1(String title, Author_1 author) {
		this.title = title;
		this.author = author;
		this.page = 0;
	}

	public Book_1() {
		this.title = "";
		this.author = null;
		this.page = 0;
	}

	public String getTitle() {
		return title;
	}

	public Author_1 getAuthor() {
		return this.author;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPage() {
		return this.page;
	}

	public String toString() {
		return getTitle() + "has" + page + "pages write by " + author.toString();
	}

}
