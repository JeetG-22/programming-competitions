package problemSetA;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem236A {

	static ArrayList<Character> distChar = new ArrayList<Character>();
	//https://codeforces.com/problemset/problem/236/A
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		distChar.add(input.charAt(0));
		int count = 1;
		for(int i = 1; i < input.length(); i++) {
			if(!uniqueChar(input.charAt(i))) {
				count++;
				distChar.add(input.charAt(i));
			}
		}
		if(count % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}

	}
	
	public static boolean uniqueChar(char c) {
		for(int i = 0; i < distChar.size(); i++) {
			if(c == distChar.get(i)) {
				return true;
			}
		}
		return false;
	}

}
