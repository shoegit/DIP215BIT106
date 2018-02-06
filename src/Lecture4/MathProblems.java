package Lecture4;

import java.util.*;

/**
 * a Java program that asks the user to enter a double value, then provides the
 * user with a list of choices: 1. to calculate the square of the value, n2 2.to
 * calculate the cube of the value, n3 3. to calculate the square root of the
 * value, n 4. to calculate the reciprocal of the value, 1/n 5. quit. Modify
 * the program to ask the user if they want to enter another number and allow
 * them to do so.
 *
 * @author ngsm
 */
public class MathProblems {

    public static void main(String[] args) {
        char another;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Please enter a value");
            double value = sc.nextDouble();
            int choice;
            // show the menu for the same value
            do {
                System.out.println("1. calculate the square");
                System.out.println("2.calculate the cube");
                System.out.println("3.calculate the square root");
                System.out.println("4. calculate the reciprocal");
                System.out.println("5. quit");

                choice = sc.nextInt();
                double answer = 0;
                switch (choice) {
                    case 1:
                        answer = value * value;
                        System.out.println("The answer is " + answer);
                        break;
                    case 2:
                        answer = Math.pow(value, 3);
                        System.out.println("The answer is " + answer);
                        break;
                    case 3:
                        if (value >= 0) {
                            answer = Math.sqrt(value);
                            System.out.println("The answer is " + answer);
                        } else {
                            System.out.println("Cannot calculate square root of negative number");
                        }
                        break;
                    case 4:
                        answer = 1 / value;
                        System.out.println("The answer is " + answer);
                        break;
                    case 5:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                        break;
                }

            } while (choice != 5);
            System.out.println("Do you want to calculate for another value");
            another = sc.next().charAt(0);
        } while (another == 'y' || another == 'Y');
    }
}
