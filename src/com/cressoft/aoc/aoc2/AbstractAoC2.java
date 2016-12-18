package com.cressoft.aoc.aoc2;

import java.awt.Point;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Direction;

public abstract class AbstractAoC2 extends AoC{
	protected Point position;
	protected Direction direction;
	protected char[][] keypad;

	protected static final String PROMPT = "Enter keypad sequence: ";
	protected final Direction DEFAULT_START_DIRECTION = Direction.NORTH;
	protected static final char INVALID_CHARACTER = 0;

	public AbstractAoC2(int partNumber, Point position, char[][] keypad) {
		super(partNumber);
		this.position = position;
		this.direction = DEFAULT_START_DIRECTION;
		this.keypad = keypad;
	}

	protected void move(String instruction){
		for(int i = 0; i < instruction.length(); i++){
			direction = Direction.translateDirection(instruction.charAt(i));
			//Multiply direction.dy by -1 due to enum using grid coordinates (need array indexes)
			Point old = new Point(position);
			position.translate(direction.dx, direction.dy * -1);
			normalizePosition();
			if(keypad[position.y][position.x] == INVALID_CHARACTER) position = old;
		}
	}

	protected void normalizePosition(){
		if(position.x < 0) position.move(0, position.y);
		if(position.x >= keypad.length) position.move(keypad.length - 1, position.y);
		if(position.y < 0) position.move(position.x, 0);
		if(position.y >= keypad.length) position.move(position.x, keypad.length - 1);
	}
}
