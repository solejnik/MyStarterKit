package com.capgemini.solejnik.GameOfLife;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GameOfLife {
	private Set<Cell> aliveCells = new HashSet<Cell>();
	private Set<Cell> deadCells = new HashSet<Cell>();

	public void initiateAliveCells(Set<Point> aliveCellsPositions) {
		for (Point aliveCellPosition : aliveCellsPositions) {
			Cell newCell = new Cell(aliveCellPosition);
			this.aliveCells.add(newCell);
		}
		fixAliveCellsNeighborsForAliveCells();
	}

	public int getAliveCells() {
		return aliveCells.size();
	}

	public void nextGeneration() {
		deadCells();
		fixAliveCellsNeighborsForDeadCells();
		Iterator<Cell> aliveCellsIterator = aliveCells.iterator();
		while (aliveCellsIterator.hasNext()) {
			Cell aliveCell = aliveCellsIterator.next();
			int countNeighbors = aliveCell.getPositionsOfAliveNeighbors().size();
			if (countNeighbors < 2 || countNeighbors > 3) {
				aliveCellsIterator.remove();
			}
		}

		Iterator<Cell> deadCellsIterator = deadCells.iterator();
		while (deadCellsIterator.hasNext()) {
			Cell deadCell = deadCellsIterator.next();
			int countNeighbors = deadCell.getPositionsOfAliveNeighbors().size();
			if (countNeighbors == 3) {
				aliveCells.add(deadCell);
			}
		}
		deadCells.clear();
		fixAliveCellsNeighborsForAliveCells();
	}

	private void fixAliveCellsNeighborsForAliveCells() {
		for (Cell aliveCell : aliveCells) {
			aliveCell.getPositionsOfAliveNeighbors().clear();
			setPositionsOfAliveNeighbors(aliveCell);
		}
	}

	private void fixAliveCellsNeighborsForDeadCells() {
		for (Cell deadCell : deadCells) {
			setPositionsOfAliveNeighbors(deadCell);
		}
	}

	private void setPositionsOfAliveNeighbors(Cell cell) {
		for (Point neighbor : cell.getPosition().getNeighboursPoints()) {
			if (aliveCells.contains(new Cell(neighbor))) {
				cell.getPositionsOfAliveNeighbors().add(neighbor);
			}
		}
	}

	private void addDeadCells(Cell aliveCell) {
		for (Point neighbor : aliveCell.getPosition().getNeighboursPoints()) {
			if (!aliveCells.contains(new Cell(neighbor))) {
				deadCells.add(new Cell(neighbor));
			}
		}
	}

	private void deadCells() {
		for (Cell aliveCell : aliveCells) {
			addDeadCells(aliveCell);
		}
	}
}
