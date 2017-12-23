/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Icecream
{
    String name;
    String flavour;
    int qty;
    float price;
    Icecream(String name,String flavour,int qty,float price)
    {
        this.name=name;
        this.flavour=flavour;
        this.qty=qty;
        this.price=price;
    }
    float price_to_pay()
    {
        return (qty*price);
    }
    
}
class ConeIceCream extends Icecream
{
    ConeIceCream(String name,String flavour,int qty,float price)
    {
        super(name,flavour,qty,price);
    }
}

final class CupIceCream extends Icecream
{
    CupIceCream(String name,String flavour,int qty,float price)
    {
        super(name,flavour,qty,price);
    }
}

public class d
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    
    	String name;
        String flavour;
        int qty;
        float price;
    
	    System.out.println("Enter the Icecream name");
    	name=sc.next();
    	    
        System.out.println("Enter the flavour of the Icecream");
    	flavour=sc.next();
    	    
    	System.out.println("Enter the Number of the Icecream needed");
    	qty=sc.nextInt();
    	
    	System.out.println("Enter the price of 1 Icecream");
    	price=sc.nextFloat();
    	
    	Icecream icecream=new Icecream(name,flavour,qty,price);
    	
    	System.out.println("You have to pay "+icecream.price_to_pay()+" Rs");
    	
	    
	    }
}



