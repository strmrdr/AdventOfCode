package com.cressoft.aoc.aoc4;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

public class Main {
	public static void main(String[] args){
		String input = Helpers.getConsoleInput(AbstractAoC4.PROMPT);

		AoC aoc1 = new AoC4P1();
		aoc1.solve(input);
		aoc1.outputSolution();

		AoC aoc2 = new AoC4P2();
		aoc2.solve(input);
		aoc2.outputSolution();
	}
}