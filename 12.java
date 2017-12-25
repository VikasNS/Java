/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		int id;
        int credit;
        int no;
        System.out.println("Enter the number of Customers");
        no=sc.nextInt();
        
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter ID");
                    id=sc.nextInt();
            System.out.println("Enter credit");
                    credit=sc.nextInt();
            m.put(id,credit);
        }
        Set<Map.Entry<Integer,Integer>> s=m.entrySet();
        for(Map.Entry<Integer,Integer> e:s)
        {
            id=e.getKey();
            credit=e.getValue();
            if(id>105 && id<120) m.put(id,credit+20);
            else if(id>125 && id<200) m.put(id,credit+30);
        }
        
        for(Map.Entry<Integer,Integer> e:s)
        {
            System.out.println(e);
        }
	}
}



