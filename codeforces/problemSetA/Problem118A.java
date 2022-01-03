package problemSetA;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem118A {

	// https://codeforces.com/problemset/problem/118/A
	public static void main(String[] args) {
		int j = 010;
		int k = 07;
		System.out.println(j);
		System.out.println(k);
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		input = input.toLowerCase();
		ArrayList<Character> arrList = new ArrayList<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (!hasVowel(input.charAt(i))) {
				arrList.add(input.charAt(i));
			}
		}
		String output = "";
		for (int i = 0; i < arrList.size(); i++) {
			output += "." + arrList.get(i);
		}
		System.out.println(output);
		kbd.close();

	}

	public static boolean hasVowel(char letter) {
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'y'};
		for (int i = 0; i < vowels.length; i++) {
			if (vowels[i] == letter) {
				return true;
			}
		}
		return false;
	}
}
