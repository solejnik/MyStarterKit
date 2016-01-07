package com.capgemini.solejnik.PokerGame;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LayoutsTest {
private Layouts layouts;
private String cardsValues;
private String layout;
private int valueOfLayout;

	@Before
	public void initialize(){
		layouts = new Layouts();
	}
	
	public LayoutsTest(String temporaryCardValues,  String temporaryLayout,int temporaryValueOfLayout){
		cardsValues = temporaryCardValues;
		valueOfLayout = temporaryValueOfLayout;
		layout = temporaryLayout;
	}
	
	 @Parameterized.Parameters
	   public static Collection cards() {
	      return Arrays.asList(new Object[][] {
	         { "5H 5C 6S 7S KD", "[2, 1, 1, 1]",1},
	         { "2C 3S 8S 8D TD", "[2, 1, 1, 1]",1},
	         { "5D 8C 9S JS AC", "[1, 1, 1, 1, 1]",0},
	         { "2C 5C 7D 8S QH", "[1, 1, 1, 1, 1]",0},
	         { "2D 9C AS AH AC", "[3, 1, 1]",3},
	         { "3D 6D 7D TD QD", "2",5},
	         { "4D 6S 9H QH QC", "[2, 1, 1, 1]",1},
	         { "3D 6D 7H QD QS", "[2, 1, 1, 1]",1},
	         { "2H 2D 4C 4D 4S", "[3, 2]",6},
	         { "3C 3D 3S 9S 9D", "[3, 2]",6}
	      });
	   }
	 
	 @Test
	 public void testLayouts(){
		 ArrayList<Card> cards = new ArrayList<Card>();
		 for(String cardValue:cardsValues.split(" ")){
			 cards.add(new Card(cardValue));
		 }
		 PokerSort sorter = new PokerSort(cards);
		 String temporaryLayout = layouts.getLayoutOfSortedCards(sorter.getCards());
		 assertEquals(layout,temporaryLayout);
		 assertEquals(valueOfLayout,layouts.getValueOfLayout(temporaryLayout));
	 }
}
