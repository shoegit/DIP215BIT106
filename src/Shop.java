import java.util.*;
/**
 * WRite a program that tells the user one notebook is $2.43
 * and asks how many notebooks they want to buy
 * THen print out the amount to pay
 * @author ngsm
 */
public class Shop {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name :");
        String name = sc.nextLine();
        // tell the user one notebook is 2.43
        double unitPrice = 2.43;
        System.out.println("One notebook is  " + unitPrice);
                
        // ask them how many they want to buy
        System.out.print("Enter number you want to buy :");
        int number = sc.nextInt();
        // calculate the total price
        double totalPrice = number * unitPrice;
        // print out the result
        System.out.printf("%s, for %d units  please pay $%8.2f%n", name, number, totalPrice);
       
               
    }
}
