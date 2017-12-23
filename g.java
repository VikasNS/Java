/******************************************************************************



*******************************************************************************/
import java.util.Scanner;
class Books
{
    String title;
    static String publisher_name="Pearson";
    String author_name;
    
    Books(String title,String author_name)
    {
        this.author_name=author_name;
        this.title=title;
        
    }
    
    
}


public class g
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Enter the title of the book");
        String title=sc.next();
        System.out.println("Enter the author_name of the book");
        String author_name=sc.next(); 
        Books book=new Books(title,author_name);
        System.out.println("Title :"+book.title+", Publisher_name :"+book.publisher_name+", Author_name :"+book.author_name);
    }


}

