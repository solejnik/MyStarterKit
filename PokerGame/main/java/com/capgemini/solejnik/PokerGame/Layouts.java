package com.capgemini.solejnik.PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Layouts {
	private Map<String, Integer> layouts = new HashMap<String, Integer>();
	private char[] cardValues = { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2' };

	protected int getValueOfLayout(String layout) {
		insertLayouts();
		return layouts.get(layout);
	}

	protected String getLayoutOfSortedCards(List<Card> cards) {
		ArrayList<Integer> layOutOfSortedCards = new ArrayList<Integer>();
		for (char value : cardValues) {
			int amountOfCard = 0;
			for (Card card : cards) {
				if (card.getValue() == value) {
					amountOfCard++;
				}
			}
			if (amountOfCard != 0) {
				layOutOfSortedCards.add(amountOfCard);
			}
		}
		Collections.sort(layOutOfSortedCards);
		Collections.reverse(layOutOfSortedCards);
		String layout = layOutOfSortedCards.toString();
		boolean isNotSimple = (layout.equals("[1, 1, 1, 1, 1]"));
		if (isStraightFlush(cards) && isNotSimple) {
			layout = "3";
		} else if (isFLush(cards) && isNotSimple) {
			layout = "2";
		} else if (isStraight(cards) && isNotSimple) {
			layout = "1";
		} else if (isLittleStraight(cards) && isNotSimple) {
			layout = "0.5";
		}
		return layout;
	}

	private void insertLayouts() {
		layouts.put("[2, 1, 1, 1]", 1);
		layouts.put("[2, 2, 1]", 2);
		layouts.put("[3, 1, 1]", 3);
		layouts.put("[3, 2]", 6);
		layouts.put("[4, 1]", 7);
		layouts.put("[1, 1, 1, 1, 1]", 0);

		layouts.put("1", 4);
		layouts.put("2", 5);
		layouts.put("3", 8);
	}

	private boolean isStraight(List<Card> cards) {
		int cardaValueDifference = cards.get(0).getValue() - cards.get(cards.size() - 1).getValue();
		boolean isStraight = (cardaValueDifference == 4 || isLittleStraight(cards));
		return isStraight;
	}

	private boolean isLittleStraight(List<Card> cards) {
		boolean isLittleStraight = true;
		char[] littleStraightValues = { 'A', '5', '4', '3', '2' };
		for (int i = 0; i < cards.size(); i++) {
			if (cards.get(i).getValue() != littleStraightValues[i]) {
				isLittleStraight = false;
			}
		}

		return isLittleStraight;
	}

	private boolean isFLush(List<Card> cards) {
		PokerSort sorter = new PokerSort(cards);
		int cardaValueDifference = sorter.countColorInCards(cards.get(0).getColor());
		boolean isFLush = cardaValueDifference == 5 ? true : false;
		return isFLush;
	}

	private boolean isStraightFlush(List<Card> cards) {
		boolean isStraightFlush = (isStraight(cards) && isFLush(cards)) ? true : false;
		return isStraightFlush;
	}
}
