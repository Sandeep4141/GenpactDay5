import java.io.Serializable;
//Serializable is an interface which does not have any method , that's why it is known as marker interface
public class Book implements Serializable{
	
	private int bookNo;
	private String name;
	private float price;
	public Book() {
		super();
	}
	public Book(int bookNo, String name, float price) {
		super();
		this.bookNo = bookNo;
		this.name = name;
		this.price = price;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public void display() {
		System.out.println("BookNo  : " +this.bookNo + " name : " + this.name + " price : " + this.price);
	}

}
