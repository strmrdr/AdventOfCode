package com.cressoft.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cressoft.aoc.AoC;
import com.cressoft.aoc.Helpers;
import com.cressoft.aoc.aoc1.AoC1P1;
import com.cressoft.aoc.aoc1.AoC1P2;
import com.cressoft.aoc.aoc2.AoC2P1;
import com.cressoft.aoc.aoc2.AoC2P2;
import com.cressoft.aoc.aoc3.AoC3P1;
import com.cressoft.aoc.aoc3.AoC3P2;

public class Testcases {
	public static final String INPUT01 = Helpers.getFileInput("Resources\\day01.txt");
	public static final String INPUT02 = Helpers.getFileInput("Resources\\day02.txt");
	public static final String INPUT03 = Helpers.getFileInput("Resources\\day03.txt");

	@Test
	public void Day1Test(){
		AoC aoc1 = new AoC1P1();
		assertEquals("298", aoc1.solve(INPUT01));
		AoC aoc2 = new AoC1P2();
		assertEquals("158", aoc2.solve(INPUT01));
	}

	@Test
	public void Day2Test() {
		AoC aoc1 = new AoC2P1();
		assertEquals("95549", aoc1.solve(INPUT02));
		AoC aoc2 = new AoC2P2();
		assertEquals("D87AD", aoc2.solve(INPUT02));
	}

	@Test
	public void Day3Test() {
		AoC aoc1 = new AoC3P1();
		assertEquals("1050", aoc1.solve(INPUT03));
		AoC aoc2 = new AoC3P2();
		assertEquals("1921", aoc2.solve(INPUT03));
	}

}
