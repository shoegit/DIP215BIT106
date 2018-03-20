package Lecture10;

import java.util.*;

/**
 * A Program that manages a bank and its accounts
 *
 * @author ngsm
 */
public class BankManager {

    static Scanner sc;
    static Bank theBank;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        theBank = new Bank(5);

        int choice;
        // menu to allow the bank to manage accounts
        do {
            System.out.println("1. Add an Account");
            System.out.println("2. Search for Account");
            System.out.println("3. Make a deposit");
            System.out.println("4. Make a withdrawal");
            System.out.println("5. Display total in all accounts");
            System.out.println("6. Display info in all accounts");
            System.out.println("7. Quit");
            System.out.print("Enter your choice :");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    addAccount();
                    break;
                case 2: 
                    searchAccount();
                            break;
                case 3:
                    makeDeposit();
                    break;
                case 4: 
                    makeWithdrawal();
                    break;
                case 5:
                    System.out.println("Balances in ALL accounts");
                    System.out.println(theBank.calcTotal());
                    break;
                case 6:
                    System.out.println(theBank.getAll());
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while (choice != 7);
    }

    /* 
     Allows the user to add information abuot a new account
     */
    public static void addAccount() {
        System.out.print("Enter name of account owner :");
        String owner = sc.nextLine();
        // create a new BankAccount
        BankAccount ba = new BankAccount(owner);
        if (theBank.addAccount(ba)) {
            System.out.println("Account added successfully");
        } else {
            System.out.println("Bank is full! NO more accounts allowed");
        }
    }

    // ALlow user to search for an account
    public static BankAccount searchAccount() {
        System.out.print("Enter name of account owner :");
        String owner = sc.nextLine();
        BankAccount found = theBank.findAccount(owner);
        if (found == null) {
            System.out.println("NO account with this owner");
        } else {
            System.out.println("Account found : " + found.toString());
        }
        return found;
    }

    // Allow user to make a deposit
    public static void makeDeposit() {
        System.out.print("Enter name of account owner :");
        String owner = sc.nextLine();
        BankAccount found = theBank.findAccount(owner);
        if (found == null) {
            System.out.println("NO account with this owner");
        } else {
            System.out.println("Current balance : " + found.getBalance());
            System.out.print("Enter amount to deposit :");
            double amount = sc.nextDouble();
            if (found.deposit(amount)) {
                System.out.println("Deposit successful");
            } else {
                System.out.println("Deposit failed");
            }
        }
    }
    
     // Allow user to make a deposit
    public static void makeWithdrawal() {
        System.out.print("Enter name of account owner :");
        String owner = sc.nextLine();
        BankAccount found = theBank.findAccount(owner);
        if (found == null) {
            System.out.println("NO account with this owner");
        } else {
            System.out.println("Current balance : " + found.getBalance());
            System.out.print("Enter amount to withdraw :");
            double amount = sc.nextDouble();
            if (found.withdraw(amount)) {
                System.out.println("Withdrawal successful");
            } else {
                System.out.println("Withdrawal failed");
            }
        }
    }
}
