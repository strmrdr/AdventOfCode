package com.cressoft.aoc.aoc1;

import java.util.Scanner;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

public class Main {
	public static final String OUTPUT_MESSAGE = "The distance to Bunny HQ is: ";

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = Helpers.getInput(in, AbstractAoC1.PROMPT);

		AoC aoc1 = new AoC1P1();
		String solution = aoc1.solve(input);
		aoc1.outputSolution(OUTPUT_MESSAGE + solution);

		AoC aoc2 = new AoC1P2();
		solution = aoc2.solve(input);
		aoc2.outputSolution(OUTPUT_MESSAGE + solution);
	}
}
