package com.mycompany.uno;

public class Card {

	enum Renk
	{
                    Kirmizi,Yesil,Sari,Mavi,Siyah;
		
		private static final Renk[] renkler = Renk.values();
		public static Renk getColor(int i)
		{
			return Renk.renkler[i];
		}
	}
	
	enum Deger
	{
		Sifir,Bir,İki,Uc,Dort,Bes,Alti,Yedi,Sekiz,Dokuz,ikiEkle,dortEkle,devamEt,dondur,renkDegistir;
		
		private static final Deger[] kartDegerleri = Deger.values();
		public static Deger getValue(int i)
		{
			return Deger.kartDegerleri[i];
		}
	}
	
	
	private final Renk color;
	private final Deger value;
	
	public Card(final Renk color,final Deger value)
	{
		this.color=color;
		this.value=value;
	}
	
	public Renk getColor()
	{
		return this.color;
	}
		
	
	public Deger getValue()
	{
		return this.value;
	}
	
	public String toString()
	{
		return color + "_" + value;
	}
	
	
	
	
}
