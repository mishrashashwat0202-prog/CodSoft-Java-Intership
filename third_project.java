import java.util.*;
public class third_project 
{
    public static void main(String args[])
    {
    Scanner in = new Scanner(System.in);
    int subjects;
    System.out.println("Enter the numbers of subjects:- ");
    subjects=in.nextInt();
    int i,sum=0;
    double avg_per;
    int marks[]=new int[subjects];
    System.out.println("All the marks of subjects are out of 100 marks.");
    System.out.println("Enter the marks of subjects:- ");
    for(i=0;i<subjects;i++)
    {
        marks[i]=in.nextInt();
        if(marks[i] < 0 || marks[i] > 100)
        {
            System.out.println("INVALID MARKS. PLEASE ENTER AGAIN.");
            i--;
        }
        else
        {
            sum=sum+marks[i];
        }
    }
    System.out.println("The total sum of all subjects are:- "+sum);
    avg_per=(double)sum/subjects;
    System.out.println("The average percentage of all subjects are:- "+avg_per+"%");
    System.out.println("THE GRADES OF STUDENT ARE AS:- ");
    System.out.println("1. 90% and above:- A+");
    System.out.println("2. 75% to 89%:- A");
    System.out.println("3. 60% to 74%:- B");
    System.out.println("4. 45% to 59%:- C");
    System.out.println("5. 30% to 44%:- D");
    System.out.println("6. BELOW 30%:- F");
    if(avg_per>=90)
    {
        System.out.println("THE GRADE OF STUDENT IS:- A+");
    }
    else if(avg_per>=75 && avg_per<=89)
    {
        System.out.println("THE GRADE OF STUDENT IS:- A");
    }
    else if(avg_per>=60 && avg_per<=74)
    {
        System.out.println("THE GRADE OF STUDENT IS:- B");
    }
    else if(avg_per>=45 && avg_per<=59)
    {
        System.out.println("THE GRADE OF STUDENT IS:- C");
    }
    else if(avg_per>=30 && avg_per<=44)
    {
        System.out.println("THE GRADE OF STUDENT IS:- D");
    }
    else
    {
        System.out.println("THE GRADE OF STUDENT IS:- F");
    }
    System.out.println("THANK YOU!!");
}
}
