import java . lang. *;
public class Admin
{
	 String Adminname;
	 String Adminid;
	 Book Books[];
	 
	 public Admin()
	 {
		 
	 }
	 
	 public Admin(String Adminname,String Adminid)
	 {
		 this.Adminname=Adminname;
		 this.Adminid=Adminid;
		 
	 }
	  public void setAdminName(String Adminname)
	 {
		 this.Adminname=Adminname;
	 }
	 public String getAdminName()
	 {
		 return Adminname;
	 }
	 public void setAdminId(String Adminid)
	 {
		 this.Adminid=Adminid;
	 }
	 public String getAdminId()
	 {
		 return Adminid;
	 } 	 
	 public void addBook(Book bo[])
	 {
        
         Books = bo;
     }
	  public void getBook()
	 {   
         for(int i=0;i<Books.length;i++)
		 {
			 if(Books[i] != null)
			 {
		       System.out.println("Course Name is: "+Books[i].getBookName());
		       System.out.println("Course Id is: "+Books[i].getBookId());
			 }
		 }
	 }
}