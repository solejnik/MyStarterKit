package com.capgemini.solejnik.PokerGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class PokerSort {
	private List<Card> cards;
	private char[] cardValues = { 'A', 'K', 'Q', 'J', 'T', '9', '8', '7', '6', '5', '4', '3', '2' };

	public PokerSort(List<Card> cards) {
		super();
		List<Card> sortedCards = new LinkedList<Card>();
		for (char value : cardValues) {
			for (Card card : cards) {
				if (card.getValue() == value) {
					sortedCards.add(card);
				}
			}
		}
		this.cards = sortedCards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void sort() {
		LinkedList<Card> sortedCards = new LinkedList<Card>();
		for (char cardValue : getOrderOfCards()) {
			for (Card card : cards) {
				if (card.getValue() == cardValue) {
					sortedCards.add(card);
				}
			}
		}
		this.cards = sortedCards;
	}

	protected int countColorInCards(char color) {
		List<Character> charList = new LinkedList<Character>();
		for (Card card : cards) {
			charList.add(card.getColor());
		}
		return Collections.frequency(charList, color);
	}

	private int countValueInCards(char value) {
		List<Character> charList = new LinkedList<Character>();
		for (Card card : cards) {
			charList.add(card.getValue());
		}
		return Collections.frequency(charList, value);
	}

	private Map<Card, Integer> getCardsWithFrequency() {
		Map<Card, Integer> newCards = new HashMap<Card, Integer>();
		for (Card card : cards) {
			newCards.put(card, countValueInCards(card.getValue()));
		}
		return newCards;
	}

	private Set<Integer> getValuesFromLayout() {
		Map<Card, Integer> cards = getCardsWithFrequency();
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (Integer cardValue : cards.values()) {
			values.add(cardValue);
		}
		Set<Integer> sortedValues = new TreeSet<Integer>(Collections.reverseOrder());
		for (Integer value : values) {
			sortedValues.add(value);
		}
		return sortedValues;
	}

	private Set<Character> getOrderOfCards() {
		Set<Character> sortedCards = new LinkedHashSet<Character>();
		Set<Integer> sortedValues = getValuesFromLayout();
		for (Integer value : sortedValues) {
			for (Card card : cards) {
				if (countValueInCards(card.getValue()) == value) {
					sortedCards.add(card.getValue());
				}
			}
		}
		return sortedCards;
	}
}
