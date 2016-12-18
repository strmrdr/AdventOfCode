package com.cressoft.aoc.aoc1;

import java.util.Scanner;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;

/**
 * --- Day 1: No Time for a Taxicab ---
 *
 * Santa's sleigh uses a very high-precision clock to guide its movements, and
 * the clock's oscillator is regulated by stars. Unfortunately, the stars have
 * been stolen... by the Easter Bunny. To save Christmas, Santa needs you to
 * retrieve all fifty stars by December 25th.<p>
 *
 * Collect stars by solving puzzles. Two puzzles will be made available on each
 * day in the advent calendar; the second puzzle is unlocked when you complete
 * the first. Each puzzle grants one star. Good luck!<p>
 *
 * You're airdropped near Easter Bunny Headquarters in a city somewhere. "Near",
 * unfortunately, is as close as you can get - the instructions on the Easter
 * Bunny Recruiting Document the Elves intercepted start here, and nobody had
 * time to work them out further.<p>
 *
 * The Document indicates that you should start at the given coordinates (where
 * you just landed) and face North. Then, follow the provided sequence: either
 * turn left (L) or right (R) 90 degrees, then walk forward the given number of
 * blocks, ending at a new intersection.<p>
 *
 * There's no time to follow such ridiculous instructions on foot, though, so
 * you take a moment and work out the destination. Given that you can only walk
 * on the street grid of the city, how far is the shortest path to the
 * destination?<p>
 *
 * For example:<p>
 *
 * Following R2, L3 leaves you 2 blocks East and 3 blocks North, or 5 blocks
 * away. R2, R2, R2 leaves you 2 blocks due South of your starting position,
 * which is 2 blocks away. R5, L5, R5, R3 leaves you 12 blocks away. How many
 * blocks away is Easter Bunny HQ?<p>
 *
 * --- Part Two ---<p>
 *
 * Then, you notice the instructions continue on the back of the Recruiting
 * Document. Easter Bunny HQ is actually at the first location you visit twice.<p>
 *
 * For example, if your instructions are R8, R4, R4, R8, the first location you
 * visit twice is 4 blocks away, due East.<p>
 *
 * How many blocks away is the first location you visit twice?
 */

public class Main {
	public static final String OUTPUT_MESSAGE = "The distance to Bunny HQ is: ";

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = Helpers.getConsoleInput(in, AbstractAoC1.PROMPT);

		AoC aoc1 = new AoC1P1();
		String solution = aoc1.solve(input);
		aoc1.outputSolution(OUTPUT_MESSAGE + solution);

		AoC aoc2 = new AoC1P2();
		solution = aoc2.solve(input);
		aoc2.outputSolution(OUTPUT_MESSAGE + solution);
	}
}
