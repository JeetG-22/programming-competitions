package problemSetA;

import java.util.Scanner;

public class Problem1220A {

	public static void main(String[] args) {
		// https://codeforces.com/problemset/problem/1220/A
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		String input = kbd.next();
		int numZ = 0;
		String output = "";
		for (int i = 0; i < n; i++) {
			if (input.charAt(i) == 'n') {
				output += "1 ";
			} else if (input.charAt(i) == 'z') {
				numZ++;
			}
		}
		int j = 0;
		while (j < numZ) {
			output += "0 ";
			j++;
		}
		System.out.println(output.trim());
		kbd.close();
	}

}
