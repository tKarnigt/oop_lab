package com.company;
public class App
{
    public static void main(String[] args) throws Exception {
        com.company.Account account = new com.company.Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        account.toStrings();
    }
}
