package prob02;

public class Book {
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	public Book(int bookNo, String title, String author) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	public void rent() {
		// TODO Auto-generated method stub
		if(this.stateCode==0) {
			System.out.println("이미 대여중입니다.");
			return;
		}
		
		System.out.println(this.title+" is rent.");
		this.stateCode = 0;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(
				"Title : "+this.title +
				", Author : " + this.author +
				", Rental : " + (this.stateCode==1 ? "재고있음 ":"대여중 ")
				);
	}
}
