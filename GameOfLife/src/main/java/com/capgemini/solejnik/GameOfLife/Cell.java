package com.capgemini.solejnik.GameOfLife;

import java.util.HashSet;
import java.util.Set;

public class Cell {
	private Point position;
	private Set<Point> positionsOfAliveNeighbors;

	public Cell(Point position) {
		super();
		this.position = position;
		this.positionsOfAliveNeighbors = new HashSet<Point>();
	}

	protected Point getPosition() {
		return position;
	}

	protected Set<Point> getPositionsOfAliveNeighbors() {
		return positionsOfAliveNeighbors;
	}

	@Override
	public String toString() {
		return "Cell [position=" + position + ", positionsOfAliveNeighbors=" + positionsOfAliveNeighbors + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

}
