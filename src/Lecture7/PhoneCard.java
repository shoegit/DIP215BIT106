package Lecture7;

/**
 * A class to define PhoneCard objects
 *
 * @author ngsm
 */
public class PhoneCard {

    // instance variables, or attributes
    private String phoneNumber;
    private double balance;

    // default constructor with no arguments
    public PhoneCard() {
        phoneNumber = ""; // empty String
        balance = 0.0;
    }

    // constructor with arguments
    public PhoneCard(String inNumber, double inBalance) {
        phoneNumber = inNumber;
        if (inBalance > 0) {
            balance = inBalance;
        } else {
            balance = 0.0;
        }
    }

    // getters , or READER methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    //setters, or WRITER methdos
    // return false if invalid values passed in
    public boolean setPhoneNumber(String newNumber) {
        if (newNumber.isEmpty()) {
            return false;
        }
        phoneNumber = newNumber;
        return true;
    }

    public boolean setBalance(double newBalance) {
        if (newBalance > 0) {
            balance = newBalance;
            return true;
        }
        return false;   // invalid balance entered
    }

    // a method to top up the phone card
    // returns false if not successful
    public boolean topUp(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    // a method to make a call
    public boolean makeCall(double duration, double costPerMin) {
        double cost = duration * costPerMin;
        if (cost > 0) { 
            balance -= cost;
        } else {
            return false;   // invalid parameters
        }
        if (balance < 0) {  // now too low balance
            balance = 0;
            return false;
        }
        return true;
    }

    // toString method
    public String toString() {
        return "A phonecard with phonenumber " + phoneNumber + " and balance " + balance;
    }
}
