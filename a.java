/******************************************************************************

A base class called Bakery contains a string attributeitem_name, and two number
attributes price and qty.  It also has a method called ;priceToPay that returns the
total price to be paid by the user.
Scenairos:
You must not allow the logic of priceToPay to be changed by the sub-classes of
Bakery.
Hint: Use ‘final’ with priceToPay’ as final int priceToPay( ) { return qty * price; }

*******************************************************************************/
import java.util.Scanner;
class Bakery
{
    String item_name;
    float price;
    int qty;
    Bakery(String item_name,float price,int qty)
    {
        this.item_name=item_name;
        this.price=price;
        this.qty=qty;
    }
    final float priceToPay()
    {
        return(price*qty);
    }
}

public class a
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
	    System.out.println("Enter the item_name");
	    String item_name=sc.next();
	    System.out.println("Enter the price");
	    float price=sc.nextFloat();
	    System.out.println("Enter the quantity");
	    int qty=sc.nextInt();
		Bakery b=new Bakery(item_name,price,qty);
		System.out.println("You have to pay "+b.priceToPay());
	}
}



