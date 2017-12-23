/******************************************************************************

                            There is a base class called &#39;Icecream&#39; containing two number attributes &#39;price&#39;
and &#39;qty&#39;, string attributes &#39;name&#39; and &#39;flavour&#39;. It also has a method called &#39;priceToPay&#39;
that returns the total price to be paid by the user.
Scenairo:
You must ensure that the sub-class &#39;ConeIceCream&#39; can be subjected to further
derivations while &#39;CupIceCream&#39; cannot be sub-classed.
Hint: Use final with ‘CupIceCream’ as final class CupIceCream { //define the class }.

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



