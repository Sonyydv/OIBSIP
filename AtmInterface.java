import java.util.Scanner;

class ATM
 {
    float Balance;
    int PIN = 8998;

    public void checkpin()
    {
      System.out.println("Enter your pin: ");
      Scanner sc = new Scanner(System.in);
      int enteredpin = sc.nextInt();
      if(enteredpin == PIN){
        menu();

      }
      else{
        System.out.println("Enter a Valid pin: ");
        menu();

      }

    }

    public void menu(){
        System.out.println("Enter Your choice : ");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt == 1){
            CheckBalance();
        }
        else if(opt == 2){
            WithDrawMoney();
        }
        else if(opt == 3){
            DepositMoney();
        }
        else if(opt == 4){
            return;
        }
        else{
            System.out.println("Enter a valid choice");
        }
   }

   public void CheckBalance()
   {
    System.out.println("Balance: =" + Balance);
    menu();
   }
   public void WithDrawMoney()
   {
    System.out.println("Enter the Amount You want to Withdraw: ");
    Scanner sc = new Scanner(System.in);
    float Amount = sc.nextFloat();
    if(Amount > Balance){
        System.out.println("Insufficient Balance");
    }
    else{
        Balance = Balance - Amount ;
        System.out.println("Money withdraw Successfully");
    }
    menu();
   }

   public void DepositMoney()
   {
    System.out.println("Enter the Amount: ");
    Scanner sc = new Scanner(System.in);
    float Amount = sc.nextFloat();
    Balance = Balance + Amount ;
    System.out.println("Money Deposited Succesfully");
    menu();
   }
   
 }

public class AtmInterface 
{
    public static void main(String[] args)
    {
        ATM obj = new ATM();
        obj.checkpin();
    }
}



