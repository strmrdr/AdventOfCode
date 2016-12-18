package com.cressoft.aoc.aoc3;

import com.cressoft.aoc.AoC;

public abstract class AbstractAoC3 extends AoC{
	protected static final String PROMPT = "Enter triangle numbers: ";

	public AbstractAoC3(int partNumber) {
		super(partNumber);
		// TODO Auto-generated constructor stub
	}

	protected boolean isValidTriangle(String str1, String str2, String str3){
		int s1 = Integer.parseInt(str1);
		int s2 = Integer.parseInt(str2);
		int s3 = Integer.parseInt(str3);
		return (s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1);
	}

}
