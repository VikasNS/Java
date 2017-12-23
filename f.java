/******************************************************************************

There is a class called &#39;Jewelery&#39; which contains a string attribute &#39;jewel_type&#39;
and a number attribute &#39;no_of_grams&#39;.
Scenairos:
a) There need to be an attribute &#39;jewel_metal&#39; which is set to “gold” and cannot be
changed.
b) You must ensure that you can never create object instances of &#39;Jewelery&#39;.
Hint: Use ‘final’ with &#39;jewel_metal&#39; as class Jewelery { final String jewel_metal =
“gold”; //rest of class implementation

*******************************************************************************/
import java.util.Scanner;
//Declaring a class abstract,prevents it form being instantiated
abstract class Jewelery
{
    String jewel_type;
    final String jewel_metal="gold";
    float no_of_grams;
    Jewelery(String jewel_type,float no_of_grams)
    {
        this.jewel_type=jewel_type;
        this.no_of_grams=no_of_grams;
        
    }
    
}


public class f
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.println("Nothing to execute");
    }


}

