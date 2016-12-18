package com.cressoft.aoc.aoc3;

import java.util.Scanner;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

public class Main {
	public static final String OUTPUT_MESSAGE = "The number of valid triangles are: ";

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String input = Helpers.getConsoleInput(in, AbstractAoC3.PROMPT);

		AoC aoc1 = new AoC3P1();
		String solution = aoc1.solve(input);
		aoc1.outputSolution(OUTPUT_MESSAGE + solution);

		AoC aoc2 = new AoC3P2();
		solution = aoc2.solve(input);
		aoc2.outputSolution(OUTPUT_MESSAGE + solution);
	}
}
