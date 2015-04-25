/**
   The Deck class creates a standard 52 card deck 
*/ 
public class Deck extends Card 
{

   // the deck is an array 
   private final int DECK_SIZE = 52; 
   private int[] deck; 
   /**
      The deck constructor creates a new standard, ordered 52 card deck  
   */ 
   public Deck() 
   {
      deck = new int[DECK_SIZE];
      
      // accumulator 
      int i = 0; 
      
      deck[i] = new Card(cSuit, cRank)  
   }
} 