package com.cressoft.aoc;

public abstract class AoC {
	public final int partNumber;
	public final String OUTPUT_MESSAGE;
	protected String solution;

	public AoC(int partNumber, String outputMessage){
		this.partNumber = partNumber;
		this.OUTPUT_MESSAGE = outputMessage;
	}

	public abstract String solve(String input);

	public void outputSolution(){
		System.out.println("\n---Part " + partNumber + "---\n" + OUTPUT_MESSAGE + solution);
	}
}
