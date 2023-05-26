import java.util.Scanner;
import java.lang.Math;

public class NumberGuessing{
     public static void main(String[] args){
       int num=(int)(Math.random()*100);
       while (true){
         System.out.println("Do you want to quite?");
         Scanner tell = new Scanner(System.in);
         String ans= tell.nextLine();
         if (ans.equals("Yes")){
            break;
         }
         System.out.println("Guess the Number: ");
         Scanner guess = new Scanner(System.in);
         int GuessedNum = guess.nextInt();
         if (GuessedNum == num){
            System.out.println("Congratulations! You Guessed the number.");
            break;
         }
         if (GuessedNum < num){
            System.out.println("No!" + "The Number is Larger than" + " num ");
        }
        else if (GuessedNum > num){
            System.out.println("No!" + "The Number is less than" + " num ");
        }

    }
}
}

