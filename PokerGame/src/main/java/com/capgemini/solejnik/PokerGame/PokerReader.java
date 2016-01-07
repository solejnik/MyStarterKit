package com.capgemini.solejnik.PokerGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PokerReader {
	private List<String> cardsStrings;

	private void readCards() {
		List<String> temporaryCardsStrings = new ArrayList<String>();
		File file = new File("poker.txt");
		Scanner scan = null;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while (scan.hasNextLine()) {
			temporaryCardsStrings.add(scan.nextLine());
		}
		cardsStrings = temporaryCardsStrings;
	}

	protected List<String> getCardsStrings() {
		readCards();
		return cardsStrings;
	}

}
