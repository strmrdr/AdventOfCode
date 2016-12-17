package com.cressoft.aoc.aoc1;

import com.cressoft.aoc.Helpers;

public class AoC1P1 extends AbstractAoC1{
	public AoC1P1(){
		super(1);
	}

	@Override
	public String solve(String input) {
		String[] instructions = Helpers.removeWhitespace(input).split(",");

		for(String each : instructions){
			char orientation = each.charAt(0);
			changeDirection(orientation);
			int distance = Integer.parseInt(each.substring(1));
			move(distance);
		}

		int distance = Helpers.manhattanDistance(0, 0, position.x, position.y);
		return String.valueOf(distance);
	}

}
