package com.capgemini.solejnik.PokerGame;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PokerSolverTest {
	private PokerSolver solver;
	private String tenCards;
	private byte winner;
	
	public PokerSolverTest(String temporarytenCards,byte temporaryWinner){
		tenCards = temporarytenCards;
		winner = temporaryWinner;
	}
	
	@Parameterized.Parameters
	   public static Collection cards() {
	      return Arrays.asList(new Object[][] {
	         { "5H 5C 6S 7S KD 2C 3S 8S 8D TD",(byte) 2},
	         { "5C AD 5D AC 9C 7C 5H 8D TD KS",(byte) 1},
	         { "3H 7H 6S KC JS QH TD JC 2D 8S",(byte) 1},
	         { "TH 8H 5C QS TC 9H 4D JC KS JS",(byte) 2},
	         { "7C 5H KC QH JD AS KH 4C AD 4S",(byte) 2},
	         { "5H KS 9C 7D 9H 8D 3S 5D 5C AH",(byte) 1},
	         { "6H 4H 5C 3H 2H 3S QH 5S 6S AS",(byte) 1},
	         { "TD 8C 4H 7C TC KC 4C 3H 7S KS",(byte) 2},
	         { "7C 9C 6D KD 3H 4C QS QC AC KH",(byte) 2},
	         { "JC 6S 5H 2H 2D KD 9D 7C AS JS",(byte) 1},
	      });
	   }
	
	@Test
	public void testPokerSolver(){
		PokerBattle  pokerBattle= new PokerBattle(tenCards);
		solver = new PokerSolver(pokerBattle);
		 assertEquals(winner,solver.getWinner());
	}
}
