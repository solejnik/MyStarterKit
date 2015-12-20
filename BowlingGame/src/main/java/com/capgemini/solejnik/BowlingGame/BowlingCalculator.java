package com.capgemini.solejnik.BowlingGame;

import java.util.ArrayList;
import java.util.List;

public class BowlingCalculator {
	private List<Frame> pinsInRolls = new ArrayList<Frame>();

	public BowlingCalculator() {
		Frame newFrame = new Frame();
		newFrame.setPins(new ArrayList<Integer>());
		pinsInRolls.add(newFrame);
	}

	public void roll(int pins) {
		Frame frame = pinsInRolls.get(pinsInRolls.size() - 1);
		frame.addToFrame(pins);
		if ((pins == 10 || frame.getShotsInFrame() == 2) && pinsInRolls.size() != 10) {
			Frame newFrame = new Frame();
			newFrame.setPins(new ArrayList<Integer>());
			pinsInRolls.add(newFrame);
			frame.setNextFrame(newFrame);
		}
	}

	public int score() {
		int scores = 0;
		for (Frame frame : pinsInRolls) {
			scores += frame.getScore();
		}
		return scores;
	}

	public boolean isFinished() {
		boolean isFinished = false;
		if (pinsInRolls.size() == 10) {
			int sizeOfLastFrame = pinsInRolls.get(9).getShotsInFrame();
			int sumOfPinsInLastRound = pinsInRolls.get(9).getSumOfPins();
			isFinished = ((sizeOfLastFrame == 3) || (sizeOfLastFrame == 2 && sumOfPinsInLastRound < 10));
		}
		return isFinished;
	}

	public int getFrameNumber() {
		return pinsInRolls.size();
	}
}
