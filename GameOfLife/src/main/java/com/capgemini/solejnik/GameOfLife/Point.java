package com.capgemini.solejnik.GameOfLife;

import java.util.HashSet;

public class Point {
	private int positionX;
	private int positionY;

	public Point(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}

	protected HashSet<Point> getNeighboursPoints() {
		
		HashSet<Point> neigbhors = new HashSet<Point>(8);

		neigbhors.add(new Point(positionX, positionY + 1));
		neigbhors.add(new Point(positionX + 1, positionY + 1));
		neigbhors.add(new Point(positionX + 1, positionY));
		neigbhors.add(new Point(positionX + 1, positionY - 1));
		neigbhors.add(new Point(positionX, positionY - 1));
		neigbhors.add(new Point(positionX - 1, positionY - 1));
		neigbhors.add(new Point(positionX - 1, positionY));
		neigbhors.add(new Point(positionX - 1, positionY + 1));
		
		return neigbhors;
	}
	
	@Override
	public String toString() {
		return "x=" + positionX + ", y=" + positionY + "|";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + positionX;
		result = prime * result + positionY;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Point other = (Point) obj;
		if (positionX != other.positionX) {
			return false;
		}
		if (positionY != other.positionY) {
			return false;
		}

		return true;
	}

}
