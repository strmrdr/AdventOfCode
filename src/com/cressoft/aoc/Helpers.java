package com.cressoft.aoc;

import java.util.Scanner;

public class Helpers {
	public static String getInput(Scanner in, String prompt){
		StringBuilder sb = new StringBuilder();
		String s;

		System.out.println(prompt);

		while(!(s = in.nextLine()).isEmpty()){
			sb.append(s);
		}

		return sb.toString();
	}

	public static int manhattanDistance(int x0, int y0, int x1, int y1){
		return Math.abs(Math.abs(x0) - Math.abs(x1)) + Math.abs(Math.abs(y0) - Math.abs(y1));
	}

	public static String removeWhitespace(String s){
		return s.replaceAll("\\s+", "");
	}
}
