/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lecture5;
/** A program to deal a card to a user
 *  The card is from a standard deck.
 * @author ngsm
 *
 */
public class Cards {
    
        // main method
	public static void main(String[] args) {

            for (int i = 1; i <=5; i++)
            {
		System.out.print("Card  "+i+":");
                generateCard();
 	   }

	}  // end of main method
        
        // A method to generate a card
        public static void generateCard()
        {
            // Generate a card
		String suitType = "" ;
		int suitNum = (int) (Math.random() * 4 + 1);
		switch (suitNum)
		{
			case 1: suitType = "Clubs"; break;
			case 2: suitType = "Hearts";break;
			case 3: suitType = "Spades";break;
			case 4: suitType = "Diamonds";break;
		}
		
		String cardName = "";
		int cardNum = (int) (Math.random() * 13 + 1);
		switch (cardNum)
		{
			case 1: cardName = "Ace"; break; 
			case 11: cardName = "Jack"; break;
			case 12: cardName = "Queen"; break;
			case 13: cardName = "King"; break;
			default: cardName = "" + cardNum; break; 
					// change the int to a String 
		}
		
		System.out.println("The " + cardName + " of " + suitType);
         
        }

}

