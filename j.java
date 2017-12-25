/******************************************************************************

3) (i) Create a LinkedList of floating point values. (Total: 3 Marks = 1 x 3 )
    (iii) Iterate through the list to add the elements of the list and display.
    (ii) Search for a given element in the list.

*******************************************************************************/
import java.util.*;

public class j
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    LinkedList<Float> ll=new LinkedList<Float>();
		Float num;
        
        int no;
        System.out.println("Enter the number of inputs");
        no=sc.nextInt();
        
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the number");
                    num=sc.nextFloat();
            ll.add(num);
            
        }
        Float ele;
        int found=0;
        System.out.println("Enter the value to be searched");
        ele=sc.nextFloat();
        for(Float f:ll)
        {
            
            if(f.equals(ele))
            {
                found=1;
                System.out.println("Element was found");
                break;
            }
            
        }
	
	    if(found!=1) System.out.println("The Element couldnot be found ");
	}
}



