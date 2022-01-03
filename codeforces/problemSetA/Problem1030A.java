package problemSetA;

import java.util.Scanner;

public class Problem1030A {
	//https://codeforces.com/problemset/problem/1030/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
//		String input = kbd.nextLine();
		String input2 = kbd.nextLine();
		String output = input2.indexOf("1") == -1 ? "EASY" : "HARD";
		System.out.println(output);
		kbd.close();

	}

}
