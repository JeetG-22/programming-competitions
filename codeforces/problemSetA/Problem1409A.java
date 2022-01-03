package problemSetA;

import java.util.Scanner;

public class Problem1409A {
	// https://codeforces.com/problemset/problem/1409/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int cases = kbd.nextInt();
		kbd.nextLine();
		int j = 0, a = 0, b = 0;
		for (int i = 0; i < cases; i++) {
			String input = kbd.nextLine();
			j = 0;
			for (String numberInputs : input.split(" ")) {
				if (j == 0) {
					a = Integer.parseInt(numberInputs);
					j++;
				} else {
					b = Integer.parseInt(numberInputs);
				}
			}
			//Greater Number
			if(a > b) {
				int diff = a-b;
				System.out.println((int)Math.ceil(diff/10.0));
			} else {
				int diff = b-a;
				System.out.println((int)Math.ceil(diff/10.0));
			}
		}
		kbd.close();
	}

}
