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
   // 10 = 10, 9=9, 8=8, 7=7, 6=6, 5=5, 4=4, 3=3, 2=2, 1=1. 
   // The format  for a card will be a value XXX, the first X (left) being the suit indicator. 
   // If the value of the two following X's are larger, then that card wins. 
   
   private int card; 
   private int suit;
   private int rank; 
   private int val;  
   
   /**
      The Card constructor creates a new card object based off of strings  
   */ 
   public Card(String cS, String cR)
   {
      if (cS.equalsIgnoreCase("hearts"))
         card = HEARTS; 
      else if (cS.equalsIgnoreCase("spades"))
         card = SPADES; 
      else if (cS.equalsIgnoreCase("clubs"))
         card = CLUBS; 
      else if (cS.equalsIgnoreCase("diamonds"))
         card = DIAMONDS; 
      else 
         System.exit(0); 
      
      if (cR.equalsIgnoreCase("ace"))
         card = card + ACE; 
      else if (cR.equalsIgnoreCase("king"))
         card = card + KING; 
      else if (cR.equalsIgnoreCase("queen"))
         card = card + QUEEN; 
      else if (cR.equalsIgnoreCase("jack"))
         card = card + JACK; 
      else  
         val = Integer.parseInt(cR);                       
         card = card + val;      
   }
   
   /**
      The Card constructor creates a new card object based off ints 
   */ 
   public Card(int cS, int cR)
   {
      if (cS == HEARTS)
         card = HEARTS; 
      else if (cS == SPADES)
         card = SPADES; 
      else if (cS == CLUBS)
         card = CLUBS; 
      else if (cS == DIAMONDS)
         card = DIAMONDS; 
      else 
         System.exit(0); 
      
      if (cR == ACE)
         card = card + ACE; 
      else if (cR == KING)
         card = card + KING; 
      else if (cR == QUEEN)
         card = card + QUEEN; 
      else if (cR == JACK)
         card = card + JACK; 
      else                        
         card = card + cR;
   } 
   
   /**
      the getSuit method returns the value of the suit as an int
      @return suit The int value of the suit (ie 100,200,300,400)
   */ 
   public int getSuit()
   {
      if (card >= 400)
         suit = 400; 
      else if (card >= 300)
         suit = 300; 
      else if (card >= 200)
         suit = 200; 
      else 
         suit = 100; 
         
      return suit;             
   }
   
   /**
      The getRank method returns the value of the rank as an int 
      @return rank The rank of the card as an int (ie 1-14) 
   */ 
   public int getRank()
   {
      // not sure I need this
      return rank; 
   } 
   
   /**
      The getCard method returns the value of the card 
      @return card the int value of the card. 
   */ 
   public int getCard()
   {
      return card; 
   } 
   /**
      the toString method returns the value of the card as a string. 
      @return str The string name of the card 
   */ 
   public String toString()
   {
      String str = "hi"; 
      return str; 
   }
   
} 