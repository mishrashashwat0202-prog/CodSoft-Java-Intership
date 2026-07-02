import java.util.*;
public class Second_Project 
{

    public static int Source_Currency()
    {

        System.out.println("Enter the source currency:- ");
        Scanner in = new Scanner(System.in);
        int source_currency;
        source_currency = in.nextInt();
        return source_currency;

    }
    public static int Target_Currency()
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the target currency:- ");
        int target_currency;
        target_currency=in.nextInt();
        return target_currency;

    }
    public static int Amount()
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter the amount:- ");
        int amount;
        amount=in.nextInt();
        return amount;

    }
    public static double Currency_Converter(int source_currency,int target_currency,int amount)
    {

        double a[]={0,1,94.28,0.88,162,0.76};
        double source_rate=a[source_currency];
        double target_rate=a[target_currency];
        double converted_amount=(amount*target_rate)/source_rate;
        return converted_amount;

    }
    public static void main(String args[])

{
    Scanner in = new Scanner(System.in);
    int choice = 0;

    do
    {

        System.out.println("\t MENU:- ");
        System.out.println("\t1.USD");
        System.out.println("\t2.INR");
        System.out.println("\t3.EURO");
        System.out.println("\t4.YEN");
        System.out.println("\t5.POUND");
        int source = Source_Currency();
        int target = Target_Currency();
        int amount = Amount();

        if(source < 1 || source > 5 || target < 1 || target > 5)
        {
            System.out.println("INVALID CURRENCY SELECTION. PLEASE TRY AGAIN.");
        }

        double result = Currency_Converter(source, target, amount);

        System.out.printf("THE CONVERTED AMOUNT IS:- %.2f" , result);

        System.out.println("\n1. Continue");
        System.out.println("2. Exit");
        System.out.print("Enter your choice: ");
        choice = in.nextInt();

    } while(choice == 1);

    System.out.println("Thank you for using the Currency Converter!");
}

}