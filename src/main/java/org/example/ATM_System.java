package org.example;
public class ATM_System{
    private final int pin;
    private double balance;
    public ATM_System(int pin,double balance)
    {
        this.pin=pin;
        this.balance=balance;
    }
    public void deposit(int amount)
    {
        if(amount>0) {
            balance += amount;
            System.out.println("Deposited amount:"+amount+" , "+"Current balance"+balance);
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
    public void withdraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
            System.out.println("Current Balance : "+balance);
        }
        else  if(amount>balance)
        {
            System.out.println("Insufficient Balance");
        }
        else {
            System.out.println("Invalid Amount");
        }
    }
    public int getPin()
    {
        return pin;
    }
    public double getBalance()
    {
        return balance;
    }

}
