/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture10;

/**
 *
 * Bank Container class A Bank has an array of BankAccounts
 *
 * @author ngsm
 */
public class Bank {

    // instance variables
    private final int SIZE = 50;
    private BankAccount[] account;
    private int numOfAccounts;

    // no-args constructor
    public Bank() {
        account = new BankAccount[SIZE];
        numOfAccounts = 0;
    }

    // constructor with size argument to 
    // set the array size to the value passed in
    public Bank(int size) {
        if (size < 0) {
            account = new BankAccount[SIZE];
        } else {
            account = new BankAccount[size];
        }
        numOfAccounts = 0;
    }

    // method allows client to add object to the container
    public boolean addAccount(BankAccount acct) {
        if (numOfAccounts == account.length) // array full!
        {
            return false;
        }
        account[numOfAccounts] = acct;		// add to array
        numOfAccounts++;	   // no. of objects increased by 1
        return true;
    }

// methods returns (summary) information about the container
    public double calcTotal() {
        double sum = 0.0;
        for (int i = 0; i < numOfAccounts; i++) {
            sum += account[i].getBalance();
        }
        return sum;
    }
// method that returns info about all accounts

    public String getAll() {
        String msg = "All accounts\n";
        for (int i = 0; i < numOfAccounts; i++) {
            msg += account[i].toString() + "\n";
        }
        return msg;
    }

}
