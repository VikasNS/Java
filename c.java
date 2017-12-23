
/******************************************************************************

                            There is a class called &#39;Animal&#39; which contains attributes such as ‘name’, &#39;gender&#39;
and &#39;age&#39;. An unrelated class called &#39;Vet&#39; contains a string attribute called
&#39;medicine_name&#39; and a member function called &#39;giveInjection&#39;, which displays the name
of the injection medicine given to the animal.
Scenairo:
The &#39;giveInjection&#39; function must be able to give injection to any animal and display
the name, gender and age of the animal given the injection.
Hint: Pass an object of animal to &#39;giveInjection&#39; as &#39;void giveInjection(Animal a) {
System.out.println(“Animal “+a.name+” which is “+a.gender+” aged “+a.age+” is
injected with “+ medicine_name); }

*******************************************************************************/
import java.util.Scanner;
class Animal
{
    String name;
    String gender;
    int age;
    Animal(String name,String gender,int age)
    {
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
}

class Vet
{
    String medicine_name;
    Vet(String medicine_name)
    {
        this.medicine_name=medicine_name;
    }
    
    void give_injection(Animal animal)
    {
        System.out.println("Animal "+animal.name+" which is "+animal.gender+" aged "+animal.age+" is injected with "+ medicine_name );
    }
}
public class c
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    
    	String name;
        String gender;
        int age;
        String medicine_name;
    
	    System.out.println("Enter the animal name");
    	name=sc.next();
    	    
        System.out.println("Enter the gender of the animal");
    	gender=sc.next();
    	    
    	System.out.println("Enter the age of the animal");
    	age=sc.nextInt();
    	
    	System.out.println("Enter the medicine to be injected");
    	medicine_name=sc.next();
    	
    	Animal animal=new Animal(name,gender,age);
    	Vet vet=new Vet(medicine_name);
    	vet.give_injection(animal);
    	
	    
	    }
}



