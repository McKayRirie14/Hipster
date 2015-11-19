package hipster.model;


/**
 * @author mrir2917
 * @version 0.x Nov 19,2015
 * 
 */
public class Hipster
{
	private String name;
	private String [] hipsterPhrases;
	private Book [] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is so mainstream!";
		hipsterPhrases[1] = "I don't mean to sound like a hipster, but, ";
		hipsterPhrases[2] = "Insert sarcastic phrase here";
		hipsterPhrases[3] = "I was into XXXXX before it was cool";
	}
	
	private void setupBooks()
	{
		Book firstBook, secondBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Neal Stephenson");
		firstBook.setTitle("Diamond Age");
		firstBook.setSubject("Science Fiction");
		firstBook.setPageCount(405);
		firstBook.setPrice(24.99);
		
		secondBook = new Book()
		secondBook.setAuthor("Stephen King");
		secondBook.setTitle("The Dank Tower");
		secondBook.setSubject("Fantasy");
		secondBook.setPageCount(355);
		secondBook.setPrice(10.99);
		
		thirdBook = new Book(855, "Own Astrachan", "Computer Sciene Tapestry", "Computer Science", 124.99);
		
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secondBook;
		hipsterBooks[2] = thirdBook;
	}
	
	public Hipster(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		
	}
}
