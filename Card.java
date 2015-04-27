// Kathryn Annis 
// CS 110A 
// 4/27/2015
// Assignment 10

/**
   The Card class holds information for the values of the cards. 
*/ 
public class Card 
{
   // set the values for the suit 
   public static final int HEARTS = 100;
   public static final int SPADES = 200;
   public static final int CLUBS = 300; 
   public static final int DIAMONDS = 400; 
   
   // set the values for the rank 
   public static final int ACE = 14; 
   public static final int KING = 13; 
   public static final int QUEEN = 12;  
   public static final int JACK = 11;
   // 10 = 10, 9=9, 8=8, 7=7, 6=6, 5=5, 4=4, 3=3, 2=2 
   // The format  for a card will be a value XXX, the first X (left) being the suit indicator. 
   // If the value of the two following X's are larger, then that card wins. 
   
   private int card; 
   private int suit;
   private int rank; 
   private int val;  
   
   /**
      The Card constructor creates a new card object based off of ints  
      @param cS the card Suit 
      @param cR the card Rank  
   */ 
   public Card(int cS, int cR)
   {
      suit = cS;
      rank = cR; 
   }   
   
   /**
      the getSuit method returns the value of the suit as an int
      @return suit The int value of the suit (ie 100,200,300,400)
   */ 
   public int getSuit()
   {  
      return suit;             
   }
   
   /**
      the suitString method returns the value of the suit as a string 
      @return str the suit string 
   */ 
   public String suitString()
   {
      String str; 
      if (suit == 100)
         str = "Hearts";
      else if (suit == 200)
         str = "Spades";
      else if (suit == 300)
         str = "Clubs"; 
      else if (suit == 400)
         str = "Diamonds"; 
      else 
         str = "??";
      return str;     
   }
   
   /**
      The getRank method returns the value of the rank as an int 
      @return rank The rank of the card as an int (ie 1-14) 
   */ 
   public int getRank()
   {
      return rank; 
   } 
   
   /**
      the rankString method returns the value of the rank as a string 
      @return str the string value 
   */
   public String rankString()
   {
      String str; 
      if (rank == 14)
         str = "Ace";
      else if (rank == 13)
         str = "King";
      else if (rank == 12)
         str = "Queen";
      else if (rank == 11)
         str = "Jack"; 
      else 
         str = "" + rank; 
      return str; 
   } 
   
   /**
      The getCard method returns the value of the card 
      @return card the int value of the card. 
   */ 
   public int getCard()
   {
      card = rank + suit; 
      return card; 
   } 
   /**
      the toString method returns the value of the card as a string. 
      @return str The string name of the card 
   */ 
   public String toString()
   {
      String str = rankString() + " of " + suitString(); 
      return str; 
   }
   
} 