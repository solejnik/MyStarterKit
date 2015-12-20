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
public class FrameTest {
	private Frame frame;
	private List<Integer> scores;
	private int score;

	@Before
	public void initialize() {
		frame = new Frame();
	}

	public FrameTest(List<Integer> temporaryScores, int temporaryScore) {
		scores = temporaryScores;
		score = temporaryScore;
	}

	@Parameterized.Parameters
	public static Collection pinsLists() {
		return Arrays
				.asList(new Object[][] { { new ArrayList<Integer>(Arrays.asList(10)), 10 },
						{ new ArrayList<Integer>(Arrays.asList(9)), 9 }, { new ArrayList<Integer>(Arrays.asList(9, 1)),
								10 },
						{ new ArrayList<Integer>(Arrays.asList(5)), 5 },
						{ new ArrayList<Integer>(Arrays.asList(5, 5)), 10 },
						{ new ArrayList<Integer>(Arrays.asList(7)), 7 },
						{ new ArrayList<Integer>(Arrays.asList(7, 2)), 9 },
						{ new ArrayList<Integer>(Arrays.asList(0)), 0 },
						{ new ArrayList<Integer>(Arrays.asList(10)), 10 },
						{ new ArrayList<Integer>(Arrays.asList(0)), 0 }, { new ArrayList<Integer>(Arrays.asList(9)), 9 },
						{ new ArrayList<Integer>(Arrays.asList(9, 0)), 9 },
						{ new ArrayList<Integer>(Arrays.asList(8)), 8 },
						{ new ArrayList<Integer>(Arrays.asList(8, 2)), 10 },
						{ new ArrayList<Integer>(Arrays.asList(9)), 9 },
						{ new ArrayList<Integer>(Arrays.asList(9, 1)), 10 },
						{ new ArrayList<Integer>(Arrays.asList(9, 1, 10)), 20 } });
	}

	@Test
	public void testFrame() {
		frame.setPins(scores);
		assertEquals(score, frame.getScore());
	}
}
