package com.capgemini.solejnik.PokerGame;

public class Card {
	private char value;
	private char color;

	public Card(String twoDigits) {
		super();
		this.value = twoDigits.charAt(0);
		this.color = twoDigits.charAt(1);
	}

	protected byte getNumberValue() {
		byte numberValue = 0;
		switch (this.value) {
		case 'A':
			numberValue = 14;
			break;
		case 'K':
			numberValue = 13;
			break;
		case 'Q':
			numberValue = 12;
			break;
		case 'J':
			numberValue = 11;
			break;
		case 'T':
			numberValue = 10;
			break;
		default:
			numberValue = Byte.parseByte("" + value);
			break;
		}
		return numberValue;
	}

	protected char getValue() {
		return value;
	}

	protected char getColor() {
		return color;
	}

}
