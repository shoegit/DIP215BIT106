import java.util.*;
package Lecture3;

/**
 * A program to check the user's grade
 * @author ngsm
 */
public class CheckGrade {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What grade did you get?");
        char grade = sc.next().charAt(0);
        
        if (grade == 'A')
            System.out.println("Wow!");
        else
            System.out.println("Try harder next time");
    }
}
