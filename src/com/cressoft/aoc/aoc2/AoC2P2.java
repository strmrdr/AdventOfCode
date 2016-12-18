package com.cressoft.aoc.aoc2;

import java.awt.Point;

import com.cressoft.aoc.Helpers;

public class AoC2P2 extends AbstractAoC2{

	public AoC2P2() {
		super(2,
				new Point(0, 2),
				new char[][]{{ 0,  0, '1', 0,  0},
							 { 0, '2','3','4', 0},
							 {'5','6','7','8','9'},
							 { 0, 'A','B','C', 0},
							 { 0,  0, 'D', 0,  0}}
		);
		// TODO Auto-generated constructor stub
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
