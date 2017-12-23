/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

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

public class Main
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



