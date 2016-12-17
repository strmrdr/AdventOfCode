package com.cressoft.aoc;

public abstract class AoC {
	public final int partNumber;

	public AoC(int partNumber){
		this.partNumber = partNumber;
	}

	public abstract String solve(String input);

	public void outputSolution(String output){
		System.out.println("\n---Part " + partNumber + "---\n" + output);
	}
}
