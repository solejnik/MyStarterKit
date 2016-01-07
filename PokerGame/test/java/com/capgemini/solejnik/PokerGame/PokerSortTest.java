package com.capgemini.solejnik.PokerGame;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PokerSortTest {
	private PokerSort sort;
	private String cardsIn;
	private String cardsOut;
	
	public PokerSortTest(String temporaryCardsIn,String temporaryCardsOut){
		cardsIn = temporaryCardsIn;
		cardsOut = temporaryCardsOut;
	}
	
	@Parameterized.Parameters
	   public static Collection cards() {
	      return Arrays.asList(new Object[][] {
	         { "5H 5C 6S 7S KD", "5H 5C KD 7S 6S "},
	         { "2C 3S 8S 8D TD", "8S 8D TD 3S 2C "},
	         { "5D 8C 9S JS AC", "AC JS 9S 8C 5D "},
	         { "2C 5C 7D 8S QH", "QH 8S 7D 5C 2C "},
	         { "2D 9C AS AH AC", "AS AH AC 9C 2D "},
	         { "3D 6D 7D TD QD", "QD TD 7D 6D 3D "},
	         { "4D 6S 9H QH QC", "QH QC 9H 6S 4D "},
	         { "3D 6D 7H QD QS", "QD QS 7H 6D 3D "},
	         { "2H 2D 4C 4D 4S", "4C 4D 4S 2H 2D "},
	         { "3C 3D 3S 9S 9D", "3C 3D 3S 9S 9D "}
	      });
	   }
	
	@Test
	public void testPokerSort(){
		List<Card> cards = new ArrayList<Card>();
		for(String card:cardsIn.split(" ")){
			cards.add(new Card(card));
		}
		sort = new PokerSort(cards);
		sort.sort();
		StringBuilder cardsout = new StringBuilder();
		for(Card card:sort.getCards()){
			cardsout.append(""+card.getValue()+card.getColor()+" ");
		}
		 assertEquals(cardsOut,cardsout.toString());
	}
}


