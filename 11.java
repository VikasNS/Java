/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Employee
{
    String name;
    int age;
    String qualification;
    int yoe;
    int Salary;
    
    Employee(String name,int age,String qualification,int yoe,int Salary)
    {
        this.name=name;
        this.age=age;
        this.qualification=qualification;
        this.yoe=yoe;
        this.Salary=Salary;
    }
    
    public String toString()
    {
        return (name+" "+age+" "+qualification+" "+yoe+" "+Salary);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		String name;
        int age;
        String qualification;
        int yoe;
        int Salary;
        int no;
        System.out.println("Enter the number of Employees");
        no=sc.nextInt();
        LinkedList<Employee> ll=new LinkedList<Employee>();
        for(int i=0;i<no;i++)
        {
            System.out.println("Enter name");
                    name=sc.next();
            System.out.println("Enter age");
                    age=sc.nextInt();
            System.out.println("Enter qualification");
                    qualification=sc.next();
            System.out.println("Enter yoe");
                    yoe=sc.nextInt();
            System.out.println("Enter Salary");
                    Salary=sc.nextInt();
                    
            
            ll.add(new Employee(name,age,qualification,yoe,Salary));
        }
        System.out.println("Employees who's yoe is grater than 5 years");
        for(Employee e:ll)
        {
            if(e.yoe>5)
            {
                System.out.println(e);
            }
        }
	}
}



