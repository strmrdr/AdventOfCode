package com.cressoft.aoc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Helpers {
	public static String getConsoleInput(Scanner in, String prompt){
		StringBuilder sb = new StringBuilder();
		String s;

		System.out.println(prompt);

		while(!(s = in.nextLine()).isEmpty()){
			sb.append(s + System.lineSeparator());
		}

		return sb.toString().trim();
	}

	public static String getFileInput(String filename){
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(filename))){
			String line = br.readLine();

			while(line != null){
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("Cannot find file: " + filename + "\n...exiting");
			System.exit(1);
		}catch(IOException e){
			e.printStackTrace();
			System.out.println("Fatal IO error... exiting");
			System.exit(1);
		}
		return sb.toString().trim();
	}

	public static int manhattanDistance(int x0, int y0, int x1, int y1){
		return Math.abs(Math.abs(x0) - Math.abs(x1)) + Math.abs(Math.abs(y0) - Math.abs(y1));
	}

	public static String removeWhitespace(String s){
		char[] arr = s.toCharArray();
		StringBuilder sb = new StringBuilder(arr.length);
		for(int i = 0; i < arr.length; i++){
			if(arr[i] != ' ') sb.append(arr[i]);
		}
		return sb.toString();
	}
}
