package com.cressoft.aoc.aoc2;

import java.awt.Point;

import com.cressoft.aoc.Helpers;

public class AoC2P1 extends AbstractAoC2{

	public AoC2P1(){
		super(1,
				new Point(1, 1),
				new char[][]{{'1','2','3'},
							 {'4','5','6'},
							 {'7','8','9'}});
				}

	@Override
	public String solve(String input) {
		StringBuilder sb = new StringBuilder();

		for(String each : instructions){
			move(each);
			sb.append(keypad[position.y][position.x]);
		}
		return sb.toString();
	}
}
