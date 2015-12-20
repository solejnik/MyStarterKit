package com.capgemini.solejnik.PokerGame;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CardTest {
	private Card card;
	private byte value;

	public CardTest(String temporaryCardString, byte temporaryValue) {
		card = new Card(temporaryCardString);
		value = temporaryValue;
	}
	
	@Parameterized.Parameters
	   public static Collection cards() {
	      return Arrays.asList(new Object[][] {
	         { "AH", (byte)14 },
	         { "KH", (byte)13 },
	         { "QH", (byte)12 },
	         { "JH", (byte)11 },
	         { "TH", (byte)10 },
	         { "9D", (byte)9 },
	         { "8H", (byte)8 },
	         { "7H", (byte)7 },
	         { "6H", (byte)6 },
	         { "5D", (byte)5 },
	         { "4H", (byte)4 },
	         { "3D", (byte)3 },
	         { "2H", (byte)2 }
	      });
	   }
	@Test
	public void testCard(){
		Assert.assertEquals(value,card.getNumberValue());
	}
}
