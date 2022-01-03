package problemSetA;

import java.util.Scanner;

public class Problem71A {
	//https://codeforces.com/problemset/problem/71/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String output = "";
		int times = kbd.nextInt();
		kbd.skip("[\r\n]+");
		for (int i = 0; i < times; i++) {
			String word = kbd.next();
			String newWord = "";
			if (word.length() > 10) {
				newWord += word.substring(0, 1) + word.substring(1, word.length() - 1).length()
						+ word.substring(word.length() - 1, word.length());
				output += newWord + "\n";
			} else {
				output += word + "\n";
			}
		}
		System.out.println(output);
		kbd.close();

	}

}
