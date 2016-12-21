package com.cressoft.aoc.aoc4;

import java.util.HashMap;
import java.util.Map;

public class Room {
	private Map<Character, Integer> letterFrequency = new HashMap<Character, Integer>(26);
	private String encryptedName = "";
	private String checksum;
	private String decryptedName = "";
	public int sectorID;

	public Room(String encryption){
		parseEncryption(encryption);
	}

	private void parseEncryption(String encryption){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < encryption.length(); i++){
			char c = encryption.charAt(i);
			if(Character.isLetter(c)){
				int freq = letterFrequency.getOrDefault(c, 0);
				letterFrequency.put(c, ++freq);
				sb.append(c);
			}else if(Character.isDigit(c)){
				i = parseSectorID(encryption, i);
				//++i to skip first bracket
				parseChecksum(encryption, ++i);
				break;
			}else if(c == '-'){
				sb.append(" ");
			}
		}
		encryptedName = sb.toString().trim();
	}

	private int parseSectorID(String encryption, int start){
		int end = start;
		while(Character.isDigit(encryption.charAt(end))){
			end++;
		}
		sectorID = Integer.parseInt(encryption.substring(start, end));
		return end;
	}

	private void parseChecksum(String encryption, int start){
		int end = start;
		while(encryption.charAt(end) != ']'){
			end++;
		}
		checksum = encryption.substring(start, end);
	}

	public boolean isValidRoom(){
		char[] highestFrequency = new char[checksum.length()];

		for(char letter : letterFrequency.keySet()){
			int letterFreq = letterFrequency.get(letter);
			for(int i = 0; i < highestFrequency.length; i++){
				if(letterFreq > letterFrequency.getOrDefault(highestFrequency[i], 0)){
					char temp = highestFrequency[i];
					highestFrequency[i] = letter;
					//Shift all letters over to accommodate for new
					for(int j = highestFrequency.length - 1; j > i; j--){
						highestFrequency[j] = highestFrequency[j-1];
						if(j - 1 == i) highestFrequency[j] = temp;
					}
					break;
				}
			}
		}

		for(int i = 0; i < checksum.length(); i++){
			char cs = checksum.charAt(i);
			char hf = highestFrequency[i];
			if(cs != hf
					&& letterFrequency.get(cs) != letterFrequency.get(hf)){
				return false;
			}
		}
		return true;
	}

	public String getDecryptedName(){
		if(decryptedName.length() == 0) applyShiftCipher();
		return decryptedName;
	}

	private void applyShiftCipher(){
		StringBuilder sb = new StringBuilder();
		for(char c : encryptedName.toCharArray()){
			if(c == ' ') sb.append(c);
			else{
				char ch = c;
				for(int i = 0; i < sectorID; i++){
					if(ch == 'z') ch = 'a';
					else ch++;
				}
				sb.append(ch);
			}
		}
		decryptedName = sb.toString().trim();
	}
}
