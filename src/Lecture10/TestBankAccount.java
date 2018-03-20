/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture10;

/**
 * Using the BankAccount class, write a driver program that:
 *
 *
 * @author ngsm
 */
public class TestBankAccount {

    public static void main(String[] args) {

    //Creates a new Bank Account in your name
    BankAccount account1 = new BankAccount("Ryan");
    //Deposit some money in the Bank Account
    if (account1.deposit(20))
    {
        System.out.println("Deposit successful");
    }   
    else
    {
        System.out.println("Deposit failed. ");
    }
           
    //Check the balance in the Bank Account
        System.out.println("Now there is " + account1.getBalance());
    //Make a withdrawal from the Bank Account
    if (account1.withdraw(5))
            System.out.println("Withdrawal ok");
    else
            System.out.println("withdrawal failed");
    
    //Display the details in the Account
        System.out.println(account1.toString());
    //Make an invalid withdrawal      
    if(account1.withdraw(20))
             System.out.println("Withdrawal ok");
    else
            System.out.println("withdrawal failed");
    
    }
}
