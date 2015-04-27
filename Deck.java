// Kathryn Annis 
// CS 110A 
// 4/27/2015
// Assignment 10

import java.util.Random;
import java.util.ArrayList; 
/**
   The Deck class creates a standard 52 card deck 
*/ 
public class Deck
{

   // the deck is an ArrayList  
   private final int DECK_SIZE = 52;   
   private ArrayList<Card> deck;
   
   // the players deck 
   private ArrayList<Card> p1; 
   private ArrayList<Card> p2;  
   
   /**
      The deck constructor creates a new standard, ordered 52 card deck  
   */ 
   public Deck() 
   {
      deck = new ArrayList<Card>();
      
      // accumulator 
      int i = 0; 
      int cRank = 2; 
      int cSuit; 
      while ( i < DECK_SIZE / 4)
      {
         cSuit = Card.HEARTS; 
         deck.add(new Card(cSuit, cRank));
         i++; cRank++;  
//          cSuit = Card.HEARTS; 
//          deck[i] = new Card();
//          deck[i].setCard(cSuit, cRank);  
//          i++; cRank++;
      }
      
      cRank = 2; 
      while (i < (DECK_SIZE / 4) * 2)
      {
         cSuit = Card.SPADES; 
         deck.add(new Card(cSuit, cRank));
         i++; cRank++;
//          cSuit = Card.SPADES; 
//          deck[i] = new Card();
//          deck[i].setCard(cSuit, cRank);
//          i++; cRank++;
      }
      
      cRank = 2; 
      while (i < (DECK_SIZE / 4) * 3)
      {
         cSuit = Card.CLUBS; 
         deck.add(new Card(cSuit, cRank));
         i++; cRank++;
      }
      
      cRank = 2; 
      while (i < DECK_SIZE)
      {
         cSuit = Card.DIAMONDS; 
         deck.add(new Card(cSuit, cRank));
         i++; cRank++;
      }
      
         
   }
   
   /**
      the dealCard method removes and returns the top card on the deck 
      @return the top card on the deck 
   */ 
   public Card dealCard()
   {
      Card c = deck.remove(0);
      return c; 
   }
   
   public int cardsRemaining()
   {
      return deck.size(); 
   }
   
   public int p1CardsRemaining()
   {
      return p1.size(); 
   }
   
   public int p2CardsRemaining()
   {
      return p2.size(); 
   }
   
   /**
      the shuffle method randomizes the order of the cards in the deck. 
   */ 
   public void shuffle()
   {
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < deck.size(); i++)
      {
         randNum = r.nextInt(deck.size());
         temp = deck.get(i); 
         deck.set(i,deck.get(randNum));
         deck.set(randNum,temp); 
      }
   }
   
   /**
      the createPlayers method creates decks for two players out of the original deck. 
   */ 
   public void createPlayers()
   {
      p1 = new ArrayList<Card>();
      p2 = new ArrayList<Card>(); 
      
      
      for (int i = 0; i < DECK_SIZE / 2; i++)
      {
         Card c = deck.remove(0);
         p1.add(c); 
      }
      for (int i = DECK_SIZE / 2 ; i < DECK_SIZE; i++) 
      {
         Card c = deck.remove(0); 
         p2.add(c); 
      }    
   }
   
   /**
      The getP1Card method reads the card on the top of player one's array. 
   */ 
   public Card getP1Card()
   {
      Card c = p1.get(0);
      return c; 
   }
   
   /**
      The getP2Card method reads the card on the top of player one's array. 
   */
   public Card getP2Card()
   {
      Card c = p2.get(0);
      return c; 
   }
   
   /**
      the p1RemoveCard method removes the card on the top of the arraylist
   */ 
   public void p1RemoveCard()
   {
      p1.remove(0); 
   }
   
   /**
      the p2RemoveCard method removes the card on the top of the arraylist
   */ 
   public void p2RemoveCard()
   {
      p2.remove(0); 
   }
   
   /**
      the p1GetRank gets the rank of the card on top 
      @return the rank.  
   */ 
   public int p1GetRank()
   {
      Card c = p1.get(0);
      return c.getRank(); 
   }
   
    /**
      the p2GetRank gets the rank of the card on top 
      @return the rank.  
   */ 
   public int p2GetRank()
   {
      Card c = p2.get(0);
      return c.getRank(); 
   }    
} 