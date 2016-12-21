package com.cressoft.aoc.aoc4;

import java.util.ArrayList;
import java.util.List;

import com.cressoft.aoc.AoC;

public abstract class AbstractAoC4 extends AoC{
	public static final String PROMPT = "Enter the encrypted room strings: ";
	public static final String OUTPUT_MESSAGE = "The sum of valid sectors is: ";
	protected List<Room> rooms = new ArrayList<Room>();

	public AbstractAoC4(int partNumber) {
		super(partNumber, OUTPUT_MESSAGE);
	}

	public AbstractAoC4(int partNumber, String outputMessage) {
		super(partNumber, outputMessage);
	}
}
