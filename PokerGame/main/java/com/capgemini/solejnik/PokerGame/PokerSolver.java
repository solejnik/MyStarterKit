package com.capgemini.solejnik.PokerGame;

public class PokerSolver {
	private static final int[] POWER = { 38416, 2744, 196, 14, 1 };
	
	private byte winner;
	private PokerBattle pokerBattle;

	public PokerSolver(PokerBattle pokerBattle) {
		super();
		this.pokerBattle = pokerBattle;
	}

	public int getWinner() {
		solvePoker();
		return winner;
	}

	private void solvePoker() {
		int firstHandLayoutPower = new Layouts()
				.getValueOfLayout(new Layouts().getLayoutOfSortedCards(pokerBattle.getFirstHand().getCards()));
		int secondHandLayoutPower = new Layouts()
				.getValueOfLayout(new Layouts().getLayoutOfSortedCards(pokerBattle.getSecondHand().getCards()));
		byte pokerWinner = compareSums(firstHandLayoutPower, secondHandLayoutPower);
		pokerWinner = pokerWinner == 0 ? solveTie() : pokerWinner;
		winner = pokerWinner;
	}

	private byte solveTie() {
		int sumOfFirstHand = 0;
		int sumOfSecondHand = 0;
		PokerHand firstHand = pokerBattle.getFirstHand();
		PokerHand secondHand = pokerBattle.getSecondHand();
		for (int i = 0; i < 5; i++) {
			sumOfFirstHand += firstHand.getCards().get(i).getNumberValue() * POWER[i];
			sumOfSecondHand += secondHand.getCards().get(i).getNumberValue() * POWER[i];
		}
		return compareSums(sumOfFirstHand, sumOfSecondHand);
	}

	private byte compareSums(int sumOfFirstHand, int sumOfSecondHand) {
		byte tieWinner = 0;
		if (sumOfFirstHand > sumOfSecondHand) {
			tieWinner = 1;
		} else if (sumOfFirstHand < sumOfSecondHand) {
			tieWinner = 2;
		}
		return tieWinner;
	}
}
