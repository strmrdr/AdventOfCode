package com.cressoft.aoc.aoc3;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

public class Main {
	public static void main(String[] args){
		String input = Helpers.getConsoleInput(AbstractAoC3.PROMPT);

		AoC aoc1 = new AoC3P1();
		aoc1.solve(input);
		aoc1.outputSolution();

		AoC aoc2 = new AoC3P2();
		aoc2.solve(input);
		aoc2.outputSolution();
	}
}
