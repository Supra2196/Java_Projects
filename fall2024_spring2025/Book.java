public class Book
{
	String title;
	String author;
	public Book(String t, String a)
	{
		title=t;
		author=a;
	}
	public void displayInfo()
	{
		System.out.println("Book:"+title+"by "+author);
	}

	public static void main(String[] args)
	{
		Book myBook=new Book("1984", "George Orwell");
		myBook.displayInfo();

	}
}