/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture4;

/**
 * a program to print square roots
 *
 * @author ngsm
 */
public class Looping {

    public static void main(String[] args) {
        // print square roots from 100 to 200
        // initialization: start at 100
        // testing: as long as it's less than 200
        // update: increase by 10 each time
        // while loop
        /*
        int i = 100;    // initialization
        while (i <= 200)
        {
           // System.out.println("The square root of " + i + " is " + Math.sqrt(i));
            System.out.printf("The square root of %d is %5.2f%n", i,Math.sqrt(i));
            i += 10;
        }
         */

        // for loop
        for (int i = 100; i <= 200; i += 10) // initialization
        {
            System.out.printf("The square root of %d is %5.2f%n", i, Math.sqrt(i));
        }

        int n = 10; // pretend the user wants to find sum 
        // of sum =  1 + 2 + 3 + N... + n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum +=i;
        }
        System.out.println("The sum from 1 to " + n + " is " + sum);
    }
    
}
