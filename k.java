
/******************************************************************************

4) (i) Create a LinkedList of floating point temperature. (Total: 3 Marks= 1 x 3 )
    (iii) Iterate through the list to add the elements of the list and display.
    (ii) Display the average value of all the temperatures in the list.

*******************************************************************************/
import java.util.*;

public class k
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    LinkedList<Float> ll=new LinkedList<Float>();
		Float temperature;
        
        int no;
        System.out.println("Enter the number of temperature inputs");
        no=sc.nextInt();
        
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter the temperature");
                    temperature=sc.nextFloat();
            ll.add(temperature);
            
        }
        Float sum=0f;
        System.out.println("Temperatures are");
        for(Float f:ll)
        {
            sum+=f;
            System.out.println(f);
        }
	
	    System.out.println("The average Temperature is "+sum/no);
	}
}



