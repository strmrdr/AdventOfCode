package com.cressoft.aoc.aoc4;

public class AoC4P1 extends AbstractAoC4{

	public AoC4P1() {
		super(1);
	}

	@Override
	public String solve(String input) {
		String[] encryption = input.split(System.lineSeparator());
		for(String each : encryption){
			Room r = new Room(each);
			rooms.add(r);
		}

		int sum = 0;
		for(Room each : rooms){
			if(each.isValidRoom()){
				sum += each.sectorID;
			}
		}
		return String.valueOf(sum);
	}

}
