package com.driver;

public class SavingsAccount extends BankAccount{
    double rate;
    double maxWithdrawalLimit;

    public SavingsAccount(String name, double balance, double maxWithdrawalLimit, double rate) {
        // minimum balance is 0 by default
        super();
        setMinBalance(0);
        setName(name);
        setBalance(balance);
        this.rate=rate;
        this.maxWithdrawalLimit=maxWithdrawalLimit;
    }
    public void withdraw(double amount) throws Exception {
        // Might throw the following errors:
        // 1. "Maximum Withdraw Limit Exceed" : If the amount exceeds maximum withdrawal limit
        // 2. "Insufficient Balance" : If the amount exceeds balance
        if(amount>getBalance()){
            throw new InsufficientBalanceException();
        }
        else if(amount>this.maxWithdrawalLimit){
             throw new MaximumWithdrawLimitExceedException();
        }
        else {
            double leftOverBalance = getBalance()-amount;
            setBalance(leftOverBalance);
        }
    }

    public double getSimpleInterest(int years){
        // Return the final amount considering that bank gives simple interest on current amount
       return (getBalance()*this.rate*years)/100;
    }

    public double getCompoundInterest(int times, int years){
        // Return the final amount considering that bank gives compound interest on current amount given times per year
          double nt =times*years;
          double con = (1+(rate/times));
          double result=getBalance()*Math.pow(con,nt);
          return result;
    }

}
