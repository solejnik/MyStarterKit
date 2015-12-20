package com.capgemini.solejnik.BowlingGame;

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
public class BowlingCalculatorTestParameterized {
	private BowlingCalculator calculator;
	private List<Integer> pins;
	private int score;
	private int frameNumber;
	private boolean isFinished;
	
	@Before
	public void initialize() {
		calculator = new BowlingCalculator();
	}


	public BowlingCalculatorTestParameterized(List<Integer> pins,int  score,int frameNumber,boolean isFinished) {
		this.score = score;
		this.pins = pins;
		this.frameNumber = frameNumber;
		this.isFinished = isFinished;
	}

	@Parameterized.Parameters
	public static Collection rools() {
		return Arrays.asList(new Object[][] { 
			{ new ArrayList<Integer>(Arrays.asList(10)), 10,2,false }, 
			{ new ArrayList<Integer>(Arrays.asList(10,9)), 28 ,2,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1)), 30 ,3,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5)), 40,3,false },
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5)), 45 ,4,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7)), 59,4,false },
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2)), 61 ,5,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10)), 71 ,6,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10)), 91 ,7,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10)), 121,8,false },
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9)), 148 ,8,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9,0)), 148,9,false },
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9,0,8)), 156 ,9,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9,0,8,2)), 158 ,10,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9,0,8,2,9)), 176 ,10,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9,0,8,2,9,1)), 177 ,10,false},
			{ new ArrayList<Integer>(Arrays.asList(10,9,1,5,5,7,2,10,10,10,9,0,8,2,9,1,10)), 187 ,10,true},
			
			{ new ArrayList<Integer>(Arrays.asList(10)), 10,2,false },
			{ new ArrayList<Integer>(Arrays.asList(10,10)), 30 ,3,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7)), 51 ,3,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3)), 57 ,4,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9)), 75 ,4,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1)), 76 ,5,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9)), 94 ,5,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0)), 94,6,false },
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10)), 104,7,false },
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7)), 118 ,7,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3)), 124 ,8,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3,10)), 144,9,false },
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3,10,9)), 162,9,false },
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3,10,9,1)), 164 ,10,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3,10,9,1,10)), 184 ,10,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3,10,9,1,10,10)), 194 ,10,false},
			{ new ArrayList<Integer>(Arrays.asList(10,10,7,3,9,1,9,0,10,7,3,10,9,1,10,10,7)), 201,10,true }
			});
	}

	// This test will run 4 times since we have 5 parameters defined
	@Test
	public void testPrimeNumberChecker() {
		for(Integer pins:this.pins){
			calculator.roll(pins);
		}
		assertEquals(score,calculator.score() );
		assertEquals(frameNumber,calculator.getFrameNumber() );
		assertEquals(isFinished,calculator.isFinished() );
	}
}