package Lecture3;

import java.time.LocalDate;
import java.util.*;

/**
 * A program to check if the user can vote
 *
 * @author ngsm
 */
public class Voting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask the user for their year of birth
        System.out.print("Enter your year of birth :");
        int yearOfBirth = sc.nextInt();
        int currentYear = LocalDate.now().getYear();

        // calculate age
        int age = currentYear - yearOfBirth;
        if (age < 21) {
            System.out.println("Too young to vote");
            System.out.println("You're so lucky");
        } else {
            System.out.println("Register as voter");
        }
    }
}
