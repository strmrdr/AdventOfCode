package com.cressoft.aoc.aoc1;

import java.awt.Point;
import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Direction;

public abstract class AbstractAoC1 extends AoC{
	protected Point position;
	protected Direction direction;

	protected final Point DEFAULT_START_POSITION = new Point();
	protected final Direction DEFAULT_START_DIRECTION = Direction.NORTH;
	protected static final String PROMPT = "Enter movement sequence: ";

	public AbstractAoC1(int partNumber){
		super(partNumber);
		this.position = DEFAULT_START_POSITION;
		this.direction = DEFAULT_START_DIRECTION;
	}

	protected void changeDirection(char orientation){
		if(orientation == 'R') direction = direction.right;
		else if(orientation == 'L') direction = direction.left;
		else throw new IllegalArgumentException("Invalid orienation: " + orientation);
	}

	protected void move(int distance){
		position.translate(direction.dx * distance, direction.dy * distance);
	}
}
