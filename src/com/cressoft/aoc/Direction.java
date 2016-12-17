package com.cressoft.aoc;

public enum Direction {
	NORTH(0, 1),
	EAST(1, 0),
	SOUTH(0, -1),
	WEST(-1, 0);

	static{
		NORTH.left = WEST;
		NORTH.right = EAST;
		EAST.left = NORTH;
		EAST.right = SOUTH;
		SOUTH.left = EAST;
		SOUTH.right = WEST;
		WEST.left = SOUTH;
		WEST.right = NORTH;
	}

	public Direction left, right;
	public int dx, dy;

	private Direction(int dx, int dy){
		this.dx = dx;
		this.dy = dy;
	}
}
