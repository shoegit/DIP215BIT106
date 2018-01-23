import java.util.Scanner;

/**
 *
 * @author ngsm
 */
public class MakingFriends {
    
    public static void main(String[] args)
    {
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("How old are you?");
        int age = sc.nextInt();
        sc.nextLine();  // consume the newline that was pressed 
        System.out.println("Wow, " +  name );
        System.out.println("Next year you will be " + (age + 1));
        System.out.println("WHat's your favourite subject?");
        String subject = sc.nextLine();
        System.out.println("I like " + subject + " too");
    }
}
