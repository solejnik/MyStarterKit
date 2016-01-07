package com.capgemini.solejnik.PokerGame;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class PokerGameTest {
	private PokerGame pokerGame;
	
	@Before
	public void initiate(){
		pokerGame = new PokerGame();
	}
	
	@Test
	public void shoudGetResult(){
		//given
		String expectingResult = "Player 1 won: 376 times, Player 2 won: 624 times.";
		//when
		String result = pokerGame.getResult();
		//then
		Assert.assertEquals(expectingResult.equals(result), true);
	}
	
	@Test
	public void shoudGetBadResult(){
		//given
		String expectingResult = "Player 1 won: 111 times, Player 2 won: 121 times.";
		//when
		String result = pokerGame.getResult();
		//then
		Assert.assertEquals(expectingResult.equals(result), false);
	}
}
