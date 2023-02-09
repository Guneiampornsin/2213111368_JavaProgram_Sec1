public class FictionBook {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	public FictionBook(String title , int publicYear) {
		this.author_name = "";
		this.email = "";
		this.title = title;
		this.publicYear = publicYear;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFirmatName() {
		return false;
	}
	public String toString() {
		return title +"write by"+author_name+"("+email+"Published for " +publicYear+"years.";
	}
	
}
