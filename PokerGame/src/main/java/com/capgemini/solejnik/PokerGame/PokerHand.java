package com.capgemini.solejnik.PokerGame;

import java.util.List;

public class PokerHand {
	private List<Card> cards;

	public PokerHand(List<Card> cards) {
		super();
		PokerSort sorter = new PokerSort(cards);
		sorter.sort();
		this.cards = sorter.getCards();
	}

	protected List<Card> getCards() {
		return cards;
	}
}
