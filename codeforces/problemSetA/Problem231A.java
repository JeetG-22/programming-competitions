package problemSetA;

import java.util.Scanner;

public class Problem231A {
	//https://codeforces.com/problemset/problem/231/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int count = 0;
		int solutions = 0;
		int contest = kbd.nextInt();
		while (contest >= count) {
			String s = kbd.nextLine().replaceAll(" ","");
			int j = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.substring(i, i + 1).equals("1")) {
					j++;
				}
			}
			if (j >= 2) {
				solutions++;
			}
			count++;
		}
		System.out.println(solutions);
		kbd.close();

	}

}
