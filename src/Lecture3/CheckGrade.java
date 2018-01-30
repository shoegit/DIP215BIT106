package Lecture3;

import java.util.*;

/**
 * A program to check the user's grade
 *
 * @author ngsm
 */
public class CheckGrade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What grade did student 1 get?");
        char stu1grade = sc.next().charAt(0);
        System.out.println("What grade did student 2 get?");
        char stu2grade = sc.next().charAt(0);

        if (stu1grade >= 'A' && stu1grade <= 'F' && stu2grade >= 'A' && stu2grade <= 'F') {
            if (stu1grade >= 'C' || stu2grade >= 'C') {
                System.out.println("Help Required");
            }
            if (stu1grade < stu2grade) {
                System.out.println("Student 1 got the better grade");
            } else if (stu2grade < stu1grade) {
                System.out.println("Student 2 got the better grade");
            } else {
                System.out.println("They both got the same grade");
            }
        } else {
            System.out.println("You entered an invalid grade");
        }

    }
}
