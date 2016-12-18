package com.cressoft.aoc.aoc3;

public class AoC3P1 extends AbstractAoC3{

	public AoC3P1() {
		super(1);
	}

	@Override
	public String solve(String input) {
		String[] numbers = input.split("\\s+");
		int validTriangles = 0;
		for(int i = 0; i < numbers.length; i += 3){
			if(isValidTriangle(numbers[i], numbers[i+1], numbers[i+2])){
				validTriangles++;
			}
		}
		return String.valueOf(validTriangles);
	}

}
