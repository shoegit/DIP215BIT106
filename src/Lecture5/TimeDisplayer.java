/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture5;
import java.util.*;
/**
 *
 * @author ngsm
 */
public class TimeDisplayer {
    
    
    // a method to return the time in hours and minutes
    public static String timeAsHrsAndMin(int timeInMin)
    {
        int hr   = timeInMin/60;
        int min = timeInMin%60;
        String result = hr + "  hours " + min + " minutes";
        return result; 
    }
    
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a time in minutes");
        int min = sc.nextInt();
        String timeAsString = timeAsHrsAndMin(min);
        System.out.println(timeAsString);
    }
    
    
}
