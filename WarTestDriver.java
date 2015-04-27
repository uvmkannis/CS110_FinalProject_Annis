// Kathryn Annis 
// CS 110A 
// 4/27/2015
// Assignment 10

import java.util.Scanner; 
/**
   The WarTestDriver class tests the classes for the War game. 
*/ 
public class WarTestDriver
{
   public static void main(String[] args)
   {
//       // Test to see if the Card class is working right SO FAR SO GOOD  
//       //System.out.println(Card.HEARTS + Card.JACK); 
//       //Card card1 = new Card(100,14);
//       //Card card2 = new Card(300, 4);
//       //System.out.println(card1.toString()); 
//       //System.out.println(card2.toString()); 
//       
//       // test out to see if the Deck class is working right 
//       Deck deck1 = new Deck();
//       // shuffle the deck 
//       deck1.shuffle();  
//       // the top two cards in the deck  
//       //System.out.println(deck1.dealCard());  
//       //System.out.println(deck1.dealCard());  
//       System.out.println(deck1.cardsRemaining()); 
//       
//       // test out if create players is working right 
//       deck1.createPlayers();
//       System.out.println(deck1.p1CardsRemaining());
//       System.out.println(deck1.p2CardsRemaining());
//       
//       // check the top two cards  
//       System.out.println(deck1.getP1Card());
//       System.out.println(deck1.getP2Card());
//       // check to see if the remove card method is working 
//       deck1.p1RemoveCard();
//       deck1.p1RemoveCard(); 
//       deck1.p2RemoveCard();
//       
//       // check to see how many cards are remaining 
//       System.out.println(deck1.p1CardsRemaining());
//       System.out.println(deck1.p2CardsRemaining());
//       System.out.println(deck1.p1GetRank()); 
         
         // Create a scanner 
         Scanner keyboard = new Scanner(System.in); 
         
         // Create a new Deck 
         Deck deck = new Deck(); 
         
         // Shuffle the deck 
         deck.shuffle(); 
         
         // Create the players decks 
         deck.createPlayers(); 
         
         // Ask the player if they want to draw
         System.out.println("Draw? Y/N");
         String input = keyboard.nextLine(); 
         // Keep the game going until the person types N
         while (input.equalsIgnoreCase("y"))
         {
            // keep the game going until one of the players runs out of cards 
            if (deck.p1CardsRemaining() != 0 && deck.p2CardsRemaining() != 0)
            {
            
               // Check the rank of the top cards in both players decks, remove appropriate cards  
               if (deck.p1GetRank() > deck.p2GetRank())
               {
                  System.out.println("\nPlayer 1 drew a " + deck.getP1Card() + " (Cards left: " + deck.p1CardsRemaining() + 
                                  ")\nPlayer 2 drew a " + deck.getP2Card() + " (Cards left: " + deck.p2CardsRemaining() +
                                  ")\nPlayer 1 wins this round");
                  deck.p2RemoveCard(); 
                  System.out.println("Draw Again? Y/N");
                  input = keyboard.nextLine();                 
               }
               
               else if (deck.p1GetRank() < deck.p2GetRank())
               {
                  System.out.println("\nPlayer 1 drew a " + deck.getP1Card() + " (Cards left: " + deck.p1CardsRemaining() + 
                                  ")\nPlayer 2 drew a " + deck.getP2Card() + " (Cards left: " + deck.p2CardsRemaining() +
                                  ")\nPlayer 2 wins this round");
                  deck.p1RemoveCard(); 
                  System.out.println("Draw Again? Y/N");
                  input = keyboard.nextLine();                 
               }
               else
               {
                 System.out.println("\nPlayer 1 drew a " + deck.getP1Card() + " (Cards left: " + deck.p1CardsRemaining() +
                                  ")\nPlayer 2 drew a " + deck.getP2Card() + " (Cards left: " + deck.p2CardsRemaining() +
                                  ")\nIt's a Draw!");
                 deck.p1RemoveCard(); 
                 deck.p2RemoveCard(); 
                 System.out.println("Draw Again? Y/N");
                 input = keyboard.nextLine();                 
               }
                                   
                                  
            }
            else // the cards run out
            { 
               // if someone ran out of cards
               if (deck.p1CardsRemaining() == 0)
               {
                  System.out.println("Player 1 has run out of cards. Player 2 wins!");
                  System.out.println("Thanks for playing!"); 
                  System.exit(0); 
               }
               else if (deck.p2CardsRemaining() == 0)
               {
                  System.out.println("Player 2 has run out of cards. Player 1 wins!");
                  System.out.println("Thanks for playing!"); 
                  System.exit(0); 
               }
               else if (deck.p1CardsRemaining() == 0 && deck.p2CardsRemaining() == 0) 
               {
                  System.out.println("Both players have run out of cards, it's a draw!");
                  System.out.println("Thanks for playing!"); 
                  System.exit(0);
               }
               else 
               {
                  // exit the system if player says no. 
                   System.out.println("Thanks for playing!"); 
                   System.exit(0);  
               } 
            }
         }
             
   } 
} 