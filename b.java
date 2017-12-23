/******************************************************************************

                            There is a class called &#39;Cricket&#39; which contains number attributes &#39;overs&#39; and
&#39;runs&#39; and a string attribute called &#39;team_name&#39;. It also has a method called &#39;display&#39;
displaying the details of these attributes.
Scenairo:
You must allow the user at run-time to create as many objects of &#39;Cricket&#39; as s(he)
desires.  
Hint: Use ‘Array of Cricket objects’ as Cricket[ ] objCricket = new Cricket[n] where
‘n’ value is taken from user at run-time

*******************************************************************************/
import java.util.Scanner;
class Cricket
{
    String team_name;
    float overs;
    int runs;
    Cricket(String team_name,float overs,int runs)
    {
        this.team_name=team_name;
        this.overs=overs;
        this.runs=runs;
    }
    void display()
    {
        System.out.println(team_name+" has scored "+runs+" runs in "+overs+" overs");
    }
}

public class b
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    String team_name;
	    float overs;
	    int runs;
	    System.out.println("Enter the Number of teams you want to work with");
	    int no_teams=sc.nextInt();
	    Cricket[] objCricket=new Cricket[no_teams];
	    for(int i=0;i<no_teams;i++)
	    {
    	    System.out.println("Enter the team_name");
    	    team_name=sc.next();
    	    
    	    System.out.println("Enter the no of overs completed");
    	    overs=sc.nextFloat();
    	    
    	    System.out.println("Enter the runs scored");
    	    runs=sc.nextInt();
    	    
    		Cricket c=new Cricket(team_name,overs,runs);
    		objCricket[i]=c;
    		
    		c.display();
    		
	
	    }     
	    }
}



