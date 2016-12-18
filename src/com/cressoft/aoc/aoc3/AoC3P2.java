package com.cressoft.aoc.aoc3;

public class AoC3P2 extends AbstractAoC3{

	public AoC3P2() {
		super(2);
	}

	@Override
	public String solve(String input) {
		String[] numbers = input.split("\\s+");
		int validTriangles = 0;
		for(int i = 0; i < 3; i++){
			for(int j = i; j < numbers.length; j+=9){
				if(isValidTriangle(numbers[j], numbers[j+3], numbers[j+6])){
					validTriangles++;
				}
			}
		}
		return String.valueOf(validTriangles);
	}

}
