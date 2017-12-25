
/******************************************************************************
2) a) Create and display an ArrayList that contains all odd numbers between 1
    to 20. ( 2 Marks) (Total: 7 Marks)
    b) Use any one &#39;Collections&#39; algorithm (E.g. &#39;shuffle&#39;, &#39;fill&#39; etc) on this ArrayList.  ( 1 Mark)
   c) Use the &#39;toArray()&#39; function to convert this ArrayList to an integer array.( 2 Marks)
   d) Use any two methods of the &#39;Arrays&#39; class on this converted integer array.( 2 Marks)

*******************************************************************************/
import java.util.*;

public class h
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++)
		{
		    if(i%2!=0) a.add(i);
		}
		System.out.println("Before shuffling");
        for(int f:a)
        {
            System.out.println(f);
            
        }
	    Collections.shuffle(a);
	    
        for(int f:a)
        {
            System.out.println(f);
            
        }
	    //We need to specify the type in which we want the array to Be
	    //In this case in array of Integer of size equal to the size of the ArrayList we have created
	    //Then we type caste it
	    Integer arr[]=(Integer[])a.toArray(new Integer[a.size()]);
	    
	    
	    //Apply 2 array methods
	    Arrays.sort(arr);
	    System.out.println("After applying sort method on array");
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.println(arr[i]);
	    }
	    //Binary search
	    
	    System.out.println("Enter the element to be searched");
	    int ele=sc.nextInt();
	    int loc;
	    if((loc=Arrays.binarySearch(arr,ele))>=0)
	    System.out.println("Found at "+loc);
	    else System.out.println("Coudnt be Found");
	    
	    
	}
}



