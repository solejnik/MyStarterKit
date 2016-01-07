package com.capgemini.solejnik.PokerGame;

import java.util.LinkedList;
import java.util.List;

public class PokerBattle {
	private PokerHand firstHand;
	private PokerHand secondHand;

	public PokerBattle(String tenCards) {
		List<Card> firstHandCards = new LinkedList<Card>();
		List<Card> secondHandCards = new LinkedList<Card>();

		String[] tenCardsSplited = tenCards.split(" ");
		for (int i = 0; i < 5; i++) {
			firstHandCards.add(new Card(tenCardsSplited[i]));
		}
		for (int i = 5; i < 10; i++) {
			secondHandCards.add(new Card(tenCardsSplited[i]));
		}
		this.firstHand = new PokerHand(firstHandCards);
		this.secondHand = new PokerHand(secondHandCards);
	}

	protected PokerHand getFirstHand() {
		return firstHand;
	}

	protected PokerHand getSecondHand() {
		return secondHand;
	}
}
