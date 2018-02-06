/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture4;

import java.util.*;

/**
 * show do while loop
 *
 * @author ngsm
 */
public class Greeting {

    public static void main(String[] args) {

        char answer;
        do {
            System.out.print("Are you (m)ale or (f)emale?");
            Scanner keyboard = new Scanner(System.in);
            answer = keyboard.next().charAt(0);
            if (answer !='m' && answer !='f')
                System.out.println("Please enter m or f");
        } while ((answer != 'm') && (answer != 'f'));

        System.out.println("Good!");
    }
}
