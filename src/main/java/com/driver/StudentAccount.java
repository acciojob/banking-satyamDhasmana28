package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {
        //minimum balance is 0 by default
        this.institutionName=institutionName;
        setName(name);
        setBalance(balance);
        setMinBalance(0);

    }

}
