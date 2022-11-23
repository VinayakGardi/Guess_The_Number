import java.util.Random;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Welcome to the GAME !!!");
    
    System.out.println("Rules:\n1.Enter the range u want to play (eg - 10 so range is 1-10)\n2.Keep guessing the number until you find the original number\n ");
    System.out.println("Enter the range you want to play");
    int range=sc.nextInt();
    Random random=new Random();

    int x = random.nextInt(range);
    System.out.println("Start guessing the number !!!");
    int userinput= sc.nextInt();
    int tried=0;
    boolean hasWon=false;
    boolean hasFinished=false;

    while(!hasFinished)
    {
      tried++;
      if(tried<5)
      {
        if(userinput<x)
        {
          System.out.println("Guess higher........");
          userinput=sc.nextInt();

        }
        else if(userinput>x)
        {
          System.out.println("Guess lower........ ");
          userinput=sc.nextInt();

        }
        else
        {
          hasWon=true;
          hasFinished=true;
        }

      }
      else
      {
        hasFinished=true;
      }



    }

    if(hasWon)
    {
      System.out.println("Congratulations !!! you won the game ");
      System.out.println("Number of times tried "+ tried);
    }
    else
    {
      System.out.println("You lost ... Better luck next time");
      System.out.println("Number was "+x);
      System.out.println("Number of times tried "+ tried);
    }
  }
}