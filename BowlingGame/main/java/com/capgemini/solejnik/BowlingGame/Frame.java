package com.capgemini.solejnik.BowlingGame;

import java.util.ArrayList;
import java.util.List;

public class Frame {
	private List<Integer> pins;
	private Frame nextFrame;

	protected void addToFrame(int pin) {
		pins.add(pin);
	}

	protected int getShotsInFrame() {
		return pins.size();
	}

	protected void setNextFrame(Frame nextFrame) {
		this.nextFrame = nextFrame;
	}

	protected void setPins(List<Integer> pins) {
		this.pins = pins;
	}

	protected int getScore() {
		int basicScore = getSumOfPins();
		if (isStrike() && getShotsInFrame() != 3) {
			basicScore += pointsFromNextShots(2);
		} else if (isSpare() && getShotsInFrame() != 3) {
			basicScore += pointsFromNextShots(1);
		}
		return basicScore;
	}

	protected int getSumOfPins() {
		int sumOfPins = 0;
		int control = 0;
		for (Integer pin : pins) {
			control++;
			if (control < 4) {
				sumOfPins += pin;
			}
		}
		return sumOfPins;
	}

	private int pointsFromNextShots(int numberOfShots) {
		ArrayList<Integer> bonusPins = new ArrayList<Integer>();
		Frame frame = this;
		if (frame != null && frame.hasNext()) {
			bonusPins.addAll(frame.nextFrame.pins);
			frame = frame.nextFrame;
			if (frame != null && frame.hasNext()) {
				bonusPins.addAll(frame.nextFrame.pins);
			}
		}
		int sumFromShots = 0;
		for (int pin : bonusPins) {
			if (numberOfShots > 0) {
				sumFromShots += pin;
				numberOfShots--;
			}
		}
		return sumFromShots;
	}

	private boolean isStrike() {
		return (getSumOfPins() == 10 && pins.size() == 1);
	}

	private boolean isSpare() {
		return (getSumOfPins() == 10 && pins.size() == 2);
	}

	private boolean hasNext() {
		return (nextFrame != null);
	}
}
