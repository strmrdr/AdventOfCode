package com.cressoft.aoc.aoc4;

public class AoC4P2 extends AbstractAoC4{
	public static final String TARGET_ROOM = "northpole object storage";
	public static final String OUTPUT_MESSAGE = "The sector of " + TARGET_ROOM + " is :";

	public AoC4P2() {
		super(2, OUTPUT_MESSAGE);
	}

	@Override
	public String solve(String input) {
		String[] encryption = input.split(System.lineSeparator());
		for(String each : encryption){
			Room r = new Room(each);
			rooms.add(r);
		}

		for(Room each : rooms){
			if(each.isValidRoom()){
				if(each.getDecryptedName().equals(TARGET_ROOM)){
					return String.valueOf(each.sectorID);
				}
			}
		}
		throw new IllegalArgumentException("No such room name: " + TARGET_ROOM);
	}

}
