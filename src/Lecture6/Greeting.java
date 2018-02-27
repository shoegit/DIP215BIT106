package Lecture6;
/**
 * A program that displays a greeting, one character per line.
 * @author ngsm
 */
public class Greeting {
    
    public static void main(String[] args)
    {
        String greeting = new String("Happy Chinese New Year!");
        // loop from beginning to end
        for(int i = 0; i<greeting.length(); i++)
        {
            System.out.println(greeting.charAt(i));
        }
    }
}
