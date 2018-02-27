package Lecture7;

/**
 *
 * @author ngsm
 */
public class TestPhoneCard {
    
    public static void main(String[] args)
    {
        PhoneCard pc1 = new PhoneCard();
        PhoneCard pc2 = new PhoneCard("007", 500);
        System.out.println("pc1 = " + pc1.toString());
        System.out.println("pc2 = " + pc2.toString());
        pc1.setPhoneNumber("10333");
        pc1.setBalance(-50);
        System.out.println(pc1);
    }
}
