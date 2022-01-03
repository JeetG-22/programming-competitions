package problemSetA;

import java.util.Scanner;

public class Problem41A {

	// https://codeforces.com/problemset/problem/41/A
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String word1 = kbd.nextLine();
		String word2 = kbd.nextLine();
		System.out.println(word1.equals(reverse(word2)) ? "YES" : "NO");
		kbd.close();
	}

	public static String reverse(String word) {
		String reverseWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverseWord += word.charAt(i);
		}
		return reverseWord;
	}

}
