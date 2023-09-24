import java . lang. *;
public class Book
{
	 String Bookname;
	 String Bookid;
	 static int count=100;
    
	 public Book()
	 {
		 System.out.println("Amount of Book: 100");
	 }
	 public Book(String Bookname,String Bookid)
	 {
		 this.Bookname=Bookname;
		 this.Bookid=Bookid;
		 
	 }
	 public static void Remainingbook()
	 {
		 count--;
		
	 }
	 public void setBookName(String Bookname)
	 {
		 this.Bookname=Bookname;
	 }
	 public String getBookName()
	 {
		 return Bookname;
	 }
	 public void setBookId(String Bookid)
	 {
		 this.Bookid=Bookid;
	 }
	 public String getBookId()
	 {
		 return Bookid;
	 } 	 
	 
	
}