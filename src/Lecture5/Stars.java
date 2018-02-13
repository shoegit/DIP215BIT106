/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture5;

/**
 *
 * @author ngsm
 */
public class Stars {

    // A method to print a line of stars
    public static void printStars() {
        System.out.println("************************");
    }

   // a method to print a line of N stars
    public static void printStars(int n)
    {
        for(int i = 1; i <=n; i++)
            System.out.print("*");
        System.out.println("");
                
    }
    
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            printStars(i);
        }
    }

}
