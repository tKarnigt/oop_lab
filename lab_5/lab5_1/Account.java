package com.company;
import java.sql.Date;
import java.sql.SQLOutput;
class Account
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public Account()
    {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new java.sql.Date(System.currentTimeMillis());
    }
    public Account(int id,double balance,double annualInterestRate)
    {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new java.sql.Date(System.currentTimeMillis());;
    }
    public Double getMonthlyInterestRate()
    {
        return (this.annualInterestRate/100)/12;
    }
    public Double getMonthlyInterest()
    {
        return this.balance * getMonthlyInterestRate();
    }
    public Double getBalance(){
        return this.balance;
    }
    public Date getDateCreated()
    {
        return this.dateCreated;
    }
    public void withdraw(double withdraw)
    {
        if(this.balance < withdraw || withdraw < 0) System.out.println("Cannot Withdraw!");
        else this.balance -= withdraw;
    }
    public void deposit(double deposit)
    {
        if(deposit < 0) System.out.println("Cannot Deposit!");
        else this.balance += deposit;
    }
    public void toStrings()
    {
        System.out.println("Balance: " + this.getBalance());
        System.out.println("Montly interest: " + this.getMonthlyInterest());
        System.out.println("Date created: " + this.getDateCreated());
    }
}
