package com.cressoft.aoc.aoc2;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

public class Main {
	public static void main(String[] args){
		String input = Helpers.getConsoleInput(AbstractAoC2.PROMPT);

		AoC aoc1 = new AoC2P1();
		aoc1.solve(input);
		aoc1.outputSolution();

		AoC aoc2 = new AoC2P2();
		aoc2.solve(input);
		aoc1.outputSolution();
	}
}
