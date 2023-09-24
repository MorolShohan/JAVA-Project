import java.util.Scanner;

public class Main 
{

    public static void main(String[] args) 
	{

         Scanner obj=new Scanner(System.in);

         int choice =0;
 
         while(choice !=4)
		 {

             System.out.println("Enter 1- for Admin \nEnter 2- for Customer");
             choice =obj.nextInt();

             if (choice == 1) 
			 {
			     System.out.print("Enter your Name: ");
				 obj.nextLine();
                 String adName=obj.nextLine();
	   
	             System.out.print("Enter your Id: ");
                 String adId=obj.nextLine();
	      
		         Admin a1=new Admin(adName,adId);
	
		         System.out.println("You can not add more than 5 books in one time");
				 System.out.print("How many book you Add: ");
				 String size=obj.nextLine();
				 System.out.print("Enter Book Name: ");
                 String bName1=obj.nextLine();
	   
	             System.out.print("Enter Book Id: ");
                 String bId1=obj.nextLine();
				  System.out.print("Enter Book Name: ");
                 String bName2=obj.nextLine();
	   
	             System.out.print("Enter Book Id: ");
                 String bId2=obj.nextLine();
				  System.out.print("Enter Book Name: ");
                 String bName3=obj.nextLine();
	   
	             System.out.print("Enter Book Id: ");
                 String bId3=obj.nextLine();
				  System.out.print("Enter Book Name: ");
                 String bName4=obj.nextLine();
	   
	             System.out.print("Enter Book Id: ");
                 String bId4=obj.nextLine();
				 System.out.print("Enter Book Name: ");
                 String bName5=obj.nextLine();
	   
	             System.out.print("Enter Book Id: ");
                 String bId5=obj.nextLine();
				 System.out.println("Admin Name: "+a1.getAdminName());
		         System.out.println("Admin Id: "+a1.getAdminId());
				
				 Book b1 = new Book(bName1,bId1);
		         Book b2 = new Book(bName2,bId2);
				 Book b3 = new Book(bName3,bId3);
				 Book b4 = new Book(bName4,bId4);
				 Book b5 = new Book(bName5,bId5);
				 
		         Book bo[]=new Book[5];
				 bo[0]=b1;
				 bo[1]=b2;
				 bo[2]=b3;
				 bo[3]=b4;
		         bo[4]=b5;
				 
				 a1.addBook(bo);
				 a1.getBook();
			 }
			
			 if (choice == 2)
			 {
				 int choice1 =0;
                 
				 while(choice1 !=4)
		         {
					 System.out.print("********  Welcome to our shop  **********\n");
                     System.out.println("Enter 1- for Text Book \nEnter 2- for Story Book \nEnter 3- for Science Fiction Book");
                     choice =obj.nextInt();
					  
				 }
             
             }

            /*else if(choice ==2){
                Module2 obj2=new Module2();

                obj2.chemistry();
                obj2.physics();
                obj2.biology();

            }
            }*/


         }

     }
}

