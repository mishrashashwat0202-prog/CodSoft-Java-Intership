import java.util.*;
public class first_project 
{
    public static double Deposit(double amount)
    {
        Scanner in=new Scanner(System.in);
        double total_balance,deposit_balance;
        System.out.println("Enter the deposit amount:- ");
        deposit_balance=in.nextDouble();
        total_balance=deposit_balance+amount;
        return total_balance;
    }
    public static double Withdraw(double total_balance)
    {
        Scanner in=new Scanner(System.in);
        double withdraw_balance;
        System.out.println("Enter the withdraw amount:- ");
        withdraw_balance=in.nextInt();
        if(withdraw_balance <= total_balance)
        {
            total_balance=total_balance-withdraw_balance;
            return total_balance;
        }
        else
        {
            System.out.println("INSUFFICIENT BALANCE");
        }
        return total_balance;
    }
public static double Check_Balance(double total_balance)
{
    return total_balance;
}
public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    double total_balance=0.0;
    int pin;
    System.out.println("ENTER YOUR PIN TO SAVE IN IT:- ");
    pin=in.nextInt();
    int check_pin;
    System.out.println("THE CURRENT AMOUNT IN YOUR BANK BALANCE IS:- 0.0");
while(true)
{
    System.out.println("Enter PIN:");
    check_pin = in.nextInt();

    if(check_pin == pin)
    {
        break;
    }

    System.out.println("Wrong PIN!");
}
while(true)
{
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Exit");

    int choice = in.nextInt();

    switch(choice)
    {
        case 1:
            total_balance = Deposit(total_balance);
            break;

        case 2:
            total_balance = Withdraw(total_balance);
            break;

        case 3:
            System.out.println("Balance = " + Check_Balance(total_balance));
            break;

        case 4:
            System.exit(0);
    }
}
}
}