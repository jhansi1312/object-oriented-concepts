package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        BankAccount account0 = new BankAccount(1, "Jhansi", 5000,false);
        BankAccount account1 = new BankAccount(2, "B", 100,false);

        System.out.println( account0.getBalance());
        account0.transfer(500, account1);
        System.out.println( account1.getBalance());
        System.out.println( account0.getBalance());
        account1.transfer(100, account0);
        System.out.println(account0.getBalance()+" "+account1.getBalance());
    }


}
