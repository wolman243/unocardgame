package com.mycompany.uno;

	import java.util.*;
	
	import javax.swing.ImageIcon;
	
	public class Deck {
	
		private Card[] deste;
		private int kartSayisi;
		
		public Deck()
		{
			deste = new Card[108];
                        yenidenBaslat();
		}
		
		public void yenidenBaslat()
		{
			Card.Renk[] colors = Card.Renk.values();
			kartSayisi = 0;
			
			for(int i = 0; i < colors.length - 1; i++)
				{
					Card.Renk color = colors[i];
					
					deste[kartSayisi++] = new Card(color, Card.Deger.getValue(0));
				
					for(int j = 1; j < 10; j++)
						{
							deste[kartSayisi++] = new Card(color, Card.Deger.getValue(j));
							deste[kartSayisi++] = new Card(color, Card.Deger.getValue(j));
							
						}
				
					Card.Deger[] values = new Card.Deger[] {Card.Deger.ikiEkle,Card.Deger.devamEt,Card.Deger.dondur}; 	
                                                for(Card.Deger deger : values)
						{
						deste[kartSayisi++] = new Card(color, deger);
						deste[kartSayisi++] = new Card(color, deger);
						}
				}
		
					Card.Deger[] values = new Card.Deger[] {Card.Deger.renkDegistir, Card.Deger.dortEkle}; 	
                                                for(Card.Deger deger : values)
						{
							for(int i = 0; i < 4; i++)
							{
								deste[kartSayisi++] = new Card(Card.Renk.Siyah, deger);
								
							}
						}	
		
		}
                
                /*public void desteDegistir(ArrayList<Card> deste){
                    this.deste = deste.toArray(newCard(card.si))
                }*/
		
		public void desteDegistir(ArrayList<Card> deste)
		{
			this.deste = deste.toArray(new Card[deste.size()]);
			this.kartSayisi = this.deste.length;
		}
		
		public boolean bosMu()
		{
			return kartSayisi==0;
		}
		
		public void karistir()
		{
			int adet =deste.length;
			Random random = new Random();
			
			for(int i=0;i<deste.length;i++)
			{
				int randomValue= i+ random.nextInt(adet-i);
				Card randomCard = deste[randomValue];
                                deste[randomValue] = deste[i];
				deste[i]= randomCard;
			}
		}
			
		public Card kartVer() throws IllegalArgumentException
		{
			if(bosMu())
			{
				throw new IllegalArgumentException("Cannot draw a card since there are no cards in the deck");
			}
		
			return deste[--kartSayisi];
		
		}
	
		public ImageIcon kartResmiGetir() throws IllegalArgumentException
		{
			if(bosMu())
			{
				throw new IllegalArgumentException("Cannot draw a card since the deck is empty");
			}
			
			return new ImageIcon(deste[--kartSayisi].toString() + ".png");	
		}
	
	
		public Card[] kartVer(int n)
		{
			if(n<0)
			{
				throw new IllegalArgumentException("Must draw positive cards but tried to draw "+ n+" cards.");
			}
		
			if(n> kartSayisi)
			{
				throw new IllegalArgumentException("Cannot draw " + n + " cards since there are only " + kartSayisi + " cards.");
			}
		
			Card[] ret  = new Card[n];
			
			for(int i = 0; i < n; i++)
			{
				ret[i] = deste[--kartSayisi];
			}
		
			return ret;
		}
		
		
		
			
	}

