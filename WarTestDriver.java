/**
   The WarTestDriver class tests the classes for the War game. 
*/ 
public class WarTestDriver
{
   public static void main(String[] args)
   {
      // Test to see if the Card class is working right  
      System.out.println(Card.HEARTS + Card.JACK); 
      Card card1 = new Card("hearts", "jack");
      Card card2 = new Card("diamonds", "3"); 
      System.out.println(card1.getCard()); 
      System.out.println(card2.getCard()); 
      
      // test out to see if the Deck class is working right 
      Deck deck1 = new Deck(); 
      
   } 
} 