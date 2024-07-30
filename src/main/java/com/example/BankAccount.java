package com.example;

public class BankAccount {
    private Integer id;
    private String name;
    private Integer balance;
    private Boolean debited;


    public BankAccount(Integer id,String name,Integer balance,Boolean debited){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.debited = debited;
    }

    public BankAccount(Integer id,String name,Integer balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
        // this.debited = debited;
    }

    public BankAccount(BankAccount b){
        this.balance = b.getBalance();
        this.id = b.getId();
        this.name = b.getName();
    }

    public Integer getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public Integer getBalance(){
        return this.balance;
    }

    public String transfer(Integer amount,BankAccount dest){
        this.debit(amount,dest);
        if(debited == true)dest.credit(amount);
        return "The amount is transferred";
    }

    public String debit(Integer amount,BankAccount dest){
        Integer bal = this.getBalance();
        if(bal<amount){
            System.out.println(this.name+" doesn't have enough balance to tranfer" );
            return "";
        }
        this.balance -= amount;
        this.debited = true;
        return "amount debited";
    }

    public String credit(Integer amount){
        this.balance += amount;
        return "amount credited";
    }


}
