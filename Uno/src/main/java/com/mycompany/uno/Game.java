/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uno;

import java.awt.Font;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Game {

        private Deck deck;
	private int currentPlayer;
	private String [] nameOfPlayer;
	private ArrayList<Card> cardOnHand;
        private ArrayList<ArrayList<Card>> handOfPlayer;
	
	private Card.Renk legalColor;
	private Card.Deger legalValue;
	
	boolean gameDirection;
	
	public Game(String[] names)
	{
		deck = new Deck();
		deck.karistir();
		cardOnHand = new ArrayList<Card>();
		
	
		nameOfPlayer= names;
		currentPlayer=0;
		gameDirection=false; 
		
	
		handOfPlayer = new ArrayList<ArrayList<Card>>();
	
            for (int i = 0; i < names.length; i++) {
                ArrayList<Card> hand = new ArrayList<Card>(Arrays.asList(deck.kartVer(7)));
                handOfPlayer.add(hand);
            }
	}
	
	public void start(Game game)
	{
		Card card = deck.kartVer();
		legalColor = card.getColor();
		legalValue = card.getValue();
                
                if(card.getValue() == Card.Deger.renkDegistir)
		{
			start(game);
		}
		
		
		if(card.getValue() == Card.Deger.dortEkle || card.getValue() == Card.Deger.ikiEkle)
		{
			start(game);
		}
	             	
		if(card.getValue() == Card.Deger.devamEt)
		{
			JLabel message = new JLabel(nameOfPlayer[currentPlayer]+ " was skipped!");
			message.setFont(new Font("Arial", Font.BOLD,48));
			JOptionPane.showMessageDialog(null,message);
			
			
			if(gameDirection == false)
			{
				currentPlayer = (currentPlayer +1) % nameOfPlayer.length;
				
			}
		
			else if(gameDirection == true)
			{
				currentPlayer = (currentPlayer -1) % nameOfPlayer.length;
				if(currentPlayer == -1)
				{
					currentPlayer = nameOfPlayer.length-1;
				}
			}
		}
                if(card.getValue() == Card.Deger.dondur)
		{
			JLabel message = new JLabel(nameOfPlayer[currentPlayer]+ " The game direction has changed");
			message.setFont(new Font("Arial",Font.BOLD,48));
			JOptionPane.showMessageDialog(null, message);
			gameDirection ^= true;
			currentPlayer = nameOfPlayer.length-1;
		}
		
		cardOnHand.add(card);
	}
        
        public Card cardOnTop()
	{
		return new Card(legalColor,legalValue);
	}
	
	public ImageIcon cardOnTopImage()
	{
		return new ImageIcon(legalColor + "_" + legalValue+ ".png");
	}
        public boolean isGameOver()
	{
		for(String player : this.nameOfPlayer)
		{
			if(handEmpty(player))
			{
				return true;
			}
		}
		return false;
	}
        
        public String getPreviousPlayer(int i)
	{
		int index = this.currentPlayer-i;
		if(index == -1)
		{
			index = nameOfPlayer.length-1;
		}
		return this.nameOfPlayer[index];
	}
	
	public String getCurrentPlayer()
	{
		return this.nameOfPlayer[this.currentPlayer];
	}
	
	
	public String [] getPlayers() 
	{
	return nameOfPlayer;	
	}
        
        public ArrayList<Card> getHandOnPlayer(String name)
	{
		int index = Arrays.asList(nameOfPlayer).indexOf(name);
		return handOfPlayer.get(index);
	}
				
	public int getSizeOfHand(String name)
	{
		return getHandOnPlayer(name).size();
	}
	
	public Card getPlayersCard(String name,int choice)
	{
		ArrayList<Card> hand = getHandOnPlayer(name);
		return hand.get(choice);
	}
        
        public boolean handEmpty(String name)
	{
		return getHandOnPlayer(name).isEmpty();
	}
        
        public boolean validCardPlay(Card card)
	{
		return card.getColor() == legalColor ||  card.getValue() == legalValue;
	}

	public void turnCheck(String name) throws InvalidPlayerTurnException
	{
		if(this.nameOfPlayer[this.currentPlayer]!= name)
                {
                    throw new InvalidPlayerTurnException("it is not "+name+"'s turn",name);
                }
        }
        
	public void submitDraw(String name) throws InvalidPlayerTurnException
	{
		turnCheck(name);	
	
		if(deck.bosMu())
		{
			deck.desteDegistir(cardOnHand);
			deck.karistir();
		}
	
		getHandOnPlayer(name).add(deck.kartVer());
		if(gameDirection == false)
		{
			currentPlayer =(currentPlayer+1) % nameOfPlayer.length;
		}
		
		else if(gameDirection == true)
		{
			currentPlayer =(currentPlayer-1) % nameOfPlayer.length;
			if(currentPlayer ==-1)
			{
				currentPlayer = nameOfPlayer.length-1;
			}
		}
	}
        
        public void setCardColor(Card.Renk color)
	{
		legalColor=color;
	}
 

	public void submitPlayerCard(String name, Card card, Card.Renk declaredColor)
	        throws InvalidColorSubmissionException, InvalidValueSubmissionException, InvalidPlayerTurnException {
	    turnCheck(name);

	    ArrayList<Card> pHand = getHandOnPlayer(name);

	    if (!validCardPlay(card)) {
	        if (card.getColor() == Card.Renk.Siyah) {
	            legalColor = card.getColor();
	            legalValue = card.getValue();
	        }
	    

	    if (card.getColor() != legalColor) {
	        JLabel message = new JLabel("Wrong move, expected color: " + legalColor + " but you got color " + card.getColor());
	        message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null,message);
                throw new InvalidColorSubmissionException("Invalid player move, expected color: " + legalColor + " but you got color " + card.getColor(), card.getColor(), legalColor);
	    } 
            else if (card.getValue() != legalValue) {
	        JLabel message2 = new JLabel("Wrong move, current value: " + legalValue + " but you got value " + card.getValue());
	        message2.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null,message2);
                throw new InvalidColorSubmissionException("Wrong move, current value: " + legalValue + " but you got value " + card.getValue(),card.getColor(),legalColor);
	    }
          }
            pHand.remove(card);
 
	    if (handEmpty(this.nameOfPlayer[currentPlayer])) {
	        JLabel message2 = new JLabel(this.nameOfPlayer[currentPlayer] + " won the game! Thank you for playing!");
	         message2.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null,message2);
                System.exit(0);
	    }

	    legalColor = card.getColor();
	    legalValue = card.getValue();
	    cardOnHand.add(card);

	    if (gameDirection == false) {
	        currentPlayer = (currentPlayer + 1) % nameOfPlayer.length;
	    }  
            else if(gameDirection == true) {
	        currentPlayer = currentPlayer - 1 % nameOfPlayer.length;
	    if(currentPlayer == -1){
                currentPlayer = nameOfPlayer.length-1;
            }
            }
            
            
            if (card.getColor() == Card.Renk.Siyah) {
                legalColor = declaredColor;
            }
            if (card.getValue() == Card.Deger.ikiEkle){
                JLabel message = new JLabel(name+"  drew 2 cards to the next player.");
                message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null, message);
	        name = nameOfPlayer[currentPlayer];
	        getHandOnPlayer(name).add(deck.kartVer());
	        getHandOnPlayer(name).add(deck.kartVer());
	    }

            if (card.getValue() == Card.Deger.dortEkle) {
                JLabel message = new JLabel(name+" drew 4 cards to the next player.");
                message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null, message);
	        name = nameOfPlayer[currentPlayer];
	        getHandOnPlayer(name).add(deck.kartVer());
	        getHandOnPlayer(name).add(deck.kartVer());
	        getHandOnPlayer(name).add(deck.kartVer());
	        getHandOnPlayer(name).add(deck.kartVer());	        
	       
	    }

	    if (card.getValue() == Card.Deger.devamEt) {
	        JLabel message = new JLabel(nameOfPlayer[currentPlayer] + " next player was skipped");
	        message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null, message);
	        if (gameDirection == false) {
	            currentPlayer = (currentPlayer + 1) % nameOfPlayer.length;
	        } 
                else if(gameDirection == true) {
	            currentPlayer = (currentPlayer - 1) % nameOfPlayer.length;
	        if(currentPlayer==-1){
                    currentPlayer = nameOfPlayer.length-1;
                }
              }
            }          
	    
            if (card.getValue() == Card.Deger.dondur) {
	        JLabel message = new JLabel(name + " reversed the game direction");
	        message.setFont(new Font("Arial",Font.BOLD,48));
                JOptionPane.showMessageDialog(null, message);

	        gameDirection ^= true;
	        if (gameDirection == true) {
	            currentPlayer = (currentPlayer - 2) % nameOfPlayer.length;
                    if(currentPlayer == -1){
                        currentPlayer = nameOfPlayer.length-1;
                }
                
                if(currentPlayer == -2){
                currentPlayer = nameOfPlayer.length-2;
                }
            }
                else if(gameDirection == false){
                    currentPlayer = (currentPlayer+2)%nameOfPlayer.length;
                }
              }
            }

	class InvalidPlayerTurnException extends Exception {
	    private String playerId;

	    public InvalidPlayerTurnException(String message, String pid) {
	        super(message);
	        playerId = pid;
	    }

	    public String getPlayerName() {
	        return playerId;
	    }
	}

	class InvalidColorSubmissionException extends Exception {
	    private Card.Renk expected;
	    private Card.Renk actual;

	    public InvalidColorSubmissionException(String message, Card.Renk actual, Card.Renk expected) {
	        super(message);
	        this.actual = actual;
	        this.expected = expected;
	    }

	    public Card.Renk getExpectedColor() {
	        return expected;
	    }

	    public Card.Renk getRealColor() {
	        return actual;
	    }
	}

	class InvalidValueSubmissionException extends Exception {
	    private Card.Deger expected;
	    private Card.Deger now;

	    public InvalidValueSubmissionException(String message, Card.Deger actual, Card.Deger expected) {
	        super(message);
	        this.now = actual;
	        this.expected = expected;
	    }

	    public Card.Deger getExpectedValue() {
	        return expected;
	    }

	    public Card.Deger getNowValue() {
	        return now;
	    }
	}

}

