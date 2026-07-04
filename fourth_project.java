import java.util.*;
public class fourth_project 
{
    public static int random_number()
    {
        Random in = new Random();
        int rand=in.nextInt(100)+1;
        return rand; 
    }
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        int num,guess,score=0,attempts,maxattempt=5,total_score=0;
        int choice=1;
        while(choice == 1)
        {
            System.out.println("Guess the number between 1 to 100!!");
            num=random_number();
            attempts=0;
             boolean won=false;
            while(attempts<maxattempt)
            {
                System.out.println("GUESS THE NUMBER:- ");
                guess=in.nextInt();
                attempts++;
                if(guess==num)
                {
                    System.out.println("CONGRATULATIONS!! YOU GUESSED IT RIGHT!!");
                    won = true;
                    break;
                }
                else if(guess<num)
                {
                    System.out.println("NO-NO!! YOUR GUESSING NUMBER IS LESS THEN THE ACTUAL TRY AGAIN!!");
                }
                else if(guess>num)
                {
                    System.out.println("NO-NO!! YOUR GUESSING NUMBER IS GREATER THAN THE ACTUAL NUMBER TRY AGAIN!!");
                }
            }
            if(attempts==maxattempt && won==false)
            {
                System.out.println("SORRY!! YOU HAVE EXHAUSTED ALL YOUR ATTEMPTS!! THE NUMBER WAS:- "+num);
            }
            if (won)
            {
                score = (maxattempt - attempts + 1) * 20;
                total_score += score;
            }
        System.out.println("DO YOU WANT TO PLAY AGAIN?? PRESS 1 FOR YES AND 0 FOR NO");
            choice=in.nextInt();

            while(choice != 0 && choice != 1)
            {
                System.out.println("INVALID INPUT!! PLEASE ENTER 1 OR 0");
                choice=in.nextInt();
            }
        if(choice==0)
        {
            System.out.println("THANK YOU FOR PLAYING!!");
            System.out.println("YOUR FINAL SCORE IS:- "+total_score);
        }
        }

        
    }
    
}
