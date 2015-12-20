package com.capgemini.solejnik.BowlingGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingCalculatorTest {
	private BowlingCalculator calculator;
	
	@Before
	public void setUp(){
		calculator = new BowlingCalculator();
	}
	
	@Test
	public void shouldScoreWithNoRoll(){
		//given
		
		//when
		Integer gameScore = calculator.score();
		//then
		Assert.assertEquals(new Integer(0),gameScore);
	}
	@Test
	public void shouldGetFrameNumberWithNoShots(){
		//given

		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(1),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWithOneStrike(){
		//given
		calculator.roll(10);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(2),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith9Strikes(){
		//given
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(10),gameFrame);
	}

	@Test
	public void shouldGetFrameNumberWith10Strikes(){
		//given
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(10),gameFrame);
	}

	@Test
	public void shouldGetFrameNumberWithSpare0_10(){
		//given
		calculator.roll(0);
		calculator.roll(10);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(2),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWithSpare5_5(){
		//given
		calculator.roll(5);
		calculator.roll(5);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(2),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith9Spares(){
		//given
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(6);
		calculator.roll(4);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(4);
		calculator.roll(6);
		
		calculator.roll(3);
		calculator.roll(7);
		
		calculator.roll(2);
		calculator.roll(8);
		
		calculator.roll(0);
		calculator.roll(10);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(10),gameFrame);
	}

	@Test
	public void shouldGetFrameNumberWith10Spares(){
		//given
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(6);
		calculator.roll(4);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(4);
		calculator.roll(6);
		
		calculator.roll(3);
		calculator.roll(7);
		
		calculator.roll(2);
		calculator.roll(8);
		
		calculator.roll(0);
		calculator.roll(10);
		
		calculator.roll(1);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(10),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith1NormalShot(){
		//given
		calculator.roll(9);
	
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(1),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith2NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(2),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith3NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(2),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith4NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(3),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith5NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(3),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith6NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(4),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith7NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(4),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith8NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(5),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith9NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(5),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith10NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(6),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith11NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(6),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith12NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(7),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith13NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(7),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith14NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(8),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith15NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(8),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith16NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(9),gameFrame);
	}
	
	@Test
	public void shouldGetFrameNumberWith17NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(9),gameFrame);
	}

	@Test
	public void shouldGetFrameNumberWith18NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Integer gameFrame = calculator.getFrameNumber();
		//then
		Assert.assertEquals(new Integer(10),gameFrame);
	}
	
	@Test
	public void shouldIsFinishedWithNoShots(){
		//given

		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithOneStrike(){
		//given
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith9Strikes(){
		//given
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}

	@Test
	public void shouldIsFinishedWith10Strikes(){
		//given
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}

	@Test
	public void shouldIsFinishedWithSpare0_10(){
		//given
		calculator.roll(0);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithSpare5_5(){
		//given
		calculator.roll(5);
		calculator.roll(5);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith9Spares(){
		//given
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(6);
		calculator.roll(4);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(4);
		calculator.roll(6);
		
		calculator.roll(3);
		calculator.roll(7);
		
		calculator.roll(2);
		calculator.roll(8);
		
		calculator.roll(0);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}

	@Test
	public void shouldIsFinishedWith10Spares(){
		//given
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(6);
		calculator.roll(4);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(4);
		calculator.roll(6);
		
		calculator.roll(3);
		calculator.roll(7);
		
		calculator.roll(2);
		calculator.roll(8);
		
		calculator.roll(0);
		calculator.roll(10);
		
		calculator.roll(1);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith1NormalShot(){
		//given
		calculator.roll(9);
	
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith2NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith3NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith4NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith5NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith6NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith7NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith8NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith9NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith10NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith11NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith12NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith13NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith14NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith15NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith16NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWith17NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}

	@Test
	public void shouldIsFinishedWith18NormalShot(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		calculator.roll(9);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithStrikeIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithTwoStrikesIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(10);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithTwoStrikesAndZeroIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(0);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(true,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithTwoStrikesAndOneIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(1);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(true,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithSpare10and0In10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(0);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithSpareIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(0);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(false,isFinished);
	}

	@Test
	public void shouldIsFinishedWithTwoNormalShotsIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(6);
		calculator.roll(2);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(true,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithSpareAndOneNormalShotsIn10Round(){
		//given
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(9);
		calculator.roll(9);
		
		calculator.roll(6);
		calculator.roll(4);
		calculator.roll(0);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(true,isFinished);
	}
	
	@Test
	public void shouldIsFinishedWithThreeStrikesIn10Round(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		//when
		Boolean isFinished = calculator.isFinished();
		//then
		Assert.assertEquals(true,isFinished);
	}
	
	@Test
	public void shouldScoreWith20Zero(){
		//given
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		calculator.roll(0);
		calculator.roll(0);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(0),score);
	}
	
	@Test
	public void shouldScoreWith13Strikes(){
		//given
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(10);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(300),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_1(){
		//given
		calculator.roll(10);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(10),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_2(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(30),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_3(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(51),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_4(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(57),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_5(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(75),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_6(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(76),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_7(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(94),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_8(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(94),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_9(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(104),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_10(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(118),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_11(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(124),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_12(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(10);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(144),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_13(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(10);
		
		calculator.roll(9);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(162),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_14(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(164),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_15(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(10);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(184),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_16(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(10);
		calculator.roll(10);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(194),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV1_17(){
		//given
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(10);
		
		calculator.roll(7);
		calculator.roll(3);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(10);
		calculator.roll(10);
		calculator.roll(7);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(201),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_1(){
		//given
		calculator.roll(10);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(10),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_2(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(28),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_3(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(30),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_4(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(40),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_5(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(45),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_6(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(59),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_7(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(61),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_8(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(71),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_9(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(91),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_10(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(121),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_11(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(148),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_12(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(148),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_13(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(8);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(156),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_14(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(8);
		calculator.roll(2);
		
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(158),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_15(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(9);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(176),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_16(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(9);
		calculator.roll(1);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(177),score);
	}
	
	@Test
	public void shouldScoreWithFullPlayV2_17(){
		//given
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(1);
		
		calculator.roll(5);
		calculator.roll(5);
		
		calculator.roll(7);
		calculator.roll(2);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(10);
		
		calculator.roll(9);
		calculator.roll(0);
		
		calculator.roll(8);
		calculator.roll(2);
		
		calculator.roll(9);
		calculator.roll(1);
		calculator.roll(10);
		//when
		Integer score = calculator.score();
		//then
		Assert.assertEquals(new Integer(187),score);
	}
}
