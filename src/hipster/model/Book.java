package hipster.model;

public class Book 
{
	private int pageCount;
	private String author;
	private String title;
	private String subject;
	private double price;
	
	public Book()
	{
		this.pageCount = 0;
		this.author = "";
		this.subject = "";
		this.title = "";
		this.price = -0.00;
	}
	
	public Book(int pageCount, String author, String subject, String title, double price)
	{
		this.pageCount = pageCount;
		this.author = author;
		this.subject = subject;
		this.title = title;
		this.price = price;
	}

	public String getAuthor() 
	{
		return author;
	}

	public String getSubject()
	{
		return subject;
	}
	
	public void setSubject(String subject)
	{
		this.subject = subject;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
