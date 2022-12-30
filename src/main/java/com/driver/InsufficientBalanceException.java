package com.driver;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super("Maximum Withdraw Limit Exceed");
    }
}
