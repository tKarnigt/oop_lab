package com.company;
public class Lab5_1_64010022
{
    public static void main(String[] args) throws Exception {
        com.company.Account account = new com.company.Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        account.toStrings();
    }
}
