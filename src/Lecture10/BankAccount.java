package Lecture10;

/**
 * A class to record information about BankAccount objects
 *
 * @author ngsm
 */
public class BankAccount {

    private String owner;
    private double balance;

    // constructor to se the owner name to the parameter 
    // ans balance default to 0.0
    public BankAccount(String inOwner) {
        owner = inOwner;
        balance = 0.0;
    }

    // getters
    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // deposit an amount to increase the balance
    // returns false if the amount is less than or equal
    // to zero
    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

     // withdraw an amount which is non-negative 
    // and less than the balance 
    public boolean withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

        // displays information abuot a BankAccount
    public String toString()
    {
        return owner + " has balance " + balance;
    }
}
