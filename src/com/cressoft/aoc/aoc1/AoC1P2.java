package com.cressoft.aoc.aoc1;

import java.awt.Point;
import java.util.HashSet;
import java.util.Set;

import com.cressoft.aoc.Helpers;

public class AoC1P2 extends AbstractAoC1{
	private Set<Point> visited;

	public AoC1P2() {
		super(2);
		visited = new HashSet<Point>();
	}

	@Override
	public String solve(String input) {
		String[] instructions = Helpers.removeWhitespace(input).split(",");

		for(String each : instructions){
			char orientation = each.charAt(0);
			changeDirection(orientation);
			int distance = Integer.parseInt(each.substring(1));
			if(isRevisited(distance)) break;

		}

		int distance = Helpers.manhattanDistance(0, 0, position.x, position.y);
		return String.valueOf(distance);
	}

	private boolean isRevisited(int distance){
		for(int i = 0; i < distance; i++){
			Point old = new Point(position);
			visited.add(old);
			move(1);
			if(visited.contains(position)){
				return true;
			}
		}
		visited.add(position);
		return false;
	}

}
