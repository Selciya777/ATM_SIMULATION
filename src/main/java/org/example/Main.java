package org.example;
import java.util.Scanner;
public class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        ATM_System atm=new ATM_System(1997,5000);
        System.out.println("Welcome to ATM System");
        System.out.print("Enter the pin:");
        int enteredPin=sc.nextInt();
        if(enteredPin==atm.getPin())
        {
            System.out.println("Correct Pin, Welcome !");
        }
        else {
            System.out.println("Incorrect Pin");
            return;
        }
        int choice;
        do{
            System.out.println("ATM OPTION:");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit amount");
            System.out.println("3.Withdrawal amount");
            System.out.println("4.Exit");
            choice =sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("The balance amount is:"+atm.getBalance());
                    break;
                case 2:
                    System.out.println("Enter the Deposit amount:");
                    int deposit=sc.nextInt();
                    atm.deposit(deposit);
                    System.out.println("Amount Deposited Successfully! Current Balance is : "+atm.getBalance());
                    break;
                case 3:
                    System.out.println("Enter the Withdrawal amount");
                    int withdraw=sc.nextInt();
                    atm.withdraw(withdraw);
                    System.out.println("Amount withdraw from your bank account ! Current Balance is:"+atm.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice! try again");
            }
        }
        while(choice!=4);
        sc.close();
    }
}