package OOPs;
import java.util.*;

class ATM{

    float Balance;
    int PIN=5987;

    public void CheckPin()
    {
        System.out.println("ENTER THE PIN");
        Scanner sc=new Scanner(System.in);
        int enteredPIN=sc.nextInt();

        if(enteredPIN==PIN)
        {
            menu();
        }
        else{
            System.out.println("ENTER THE VALID PIN");
            CheckPin();
        }
    }
    public void menu()
    {   
        System.out.println("SELECT OPTION");
        System.out.println("1.CHECK BALANCE");
        System.out.println("2.DEPOSITE MONEY");
        System.out.println("3.WITHDRAWL MONEY");
        System.out.println("4.EXIT");

        Scanner opt=new Scanner(System.in);
        int option=opt.nextInt();
        if(option==1)
        {
            CheckBalance();
        }
        else if(option==2)
        {
            Deposite();
        }
        else if(option==3)
        {
            withdrawl();
        }
        else if(option==4)
        {
            return;
        }
        else
        {
            System.out.println("SELECT VALID OPTION");
            menu();
        }
    }
    public void CheckBalance()
        {
          System.out.println("CURRENT BALANCE="+Balance);
          menu(); 
        } 
    public void Deposite()
    {
        System.out.println("ENTER AMOUNT FOR DEPOSITE");
        Scanner depo=new Scanner(System.in);
        float amount=depo.nextInt();
        Balance=Balance+amount;
        System.out.println("DEPOSITE SUCCESSFULL");
        menu();
    }
    public void withdrawl()
    {
        System.out.println("ENTER AMOUNT");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        if(amount<=Balance)
        {
            Balance=Balance-amount;
            System.out.println("WITHDRAWL SUCCESSFULL");
        }
        else{
            System.out.println("INSUFFICIENT BALANCE");
        }
        menu();
    }
    
}

   
    public class AtmMachine{
    public static void main(String[]args)
    {
        ATM obj=new ATM();
        obj.CheckPin();
    }
    }
    

