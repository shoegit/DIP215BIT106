/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture4;

import java.util.*;

/**
 *
 * @author ngsm
 */
public class DoWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char answer;
        do {
            System.out.println("This is a do while loop");
            System.out.println("It's different from a while loop");
            System.out.println("Do you understand?");
            answer = sc.next().charAt(0);
            while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
                System.out.println("Please answer Y or N");
                System.out.println("Do you understand?");
                answer = sc.next().charAt(0);

            }

        } while (!(answer == 'y' || answer == 'Y'));
    }
}
