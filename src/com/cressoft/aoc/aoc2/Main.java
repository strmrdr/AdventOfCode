package com.cressoft.aoc.aoc2;

import java.util.Scanner;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

public class Main {
	public static final String OUTPUT_MESSAGE = "The keypad password is: ";

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		AoC aoc1 = new AoC2P1();
		String solution = aoc1.solve(input);
		aoc1.outputSolution(OUTPUT_MESSAGE + solution);

		AoC aoc2 = new AoC2P2();
		solution = aoc2.solve(input);
		aoc1.outputSolution(OUTPUT_MESSAGE + solution);
	}
}
