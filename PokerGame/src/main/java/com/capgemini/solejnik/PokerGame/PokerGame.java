package com.capgemini.solejnik.PokerGame;

public class PokerGame {
	private int winFirst;
	private int winSecond;

	private void countWinForPlayers() {
		PokerReader reader = new PokerReader();
		for (String cards : reader.getCardsStrings()) {
			PokerBattle battle = new PokerBattle(cards);
			PokerSolver solver = new PokerSolver(battle);
			switch (solver.getWinner()) {
			case 1:
				winFirst++;
				break;
			case 2:
				winSecond++;
				break;
			default:
				break;
			}
		}
	}

	protected String getResult() {
		countWinForPlayers();
		return "Player 1 won: " + winFirst + " times, Player 2 won: " + winSecond + " times.";
	}
}
