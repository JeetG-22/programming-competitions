package problemSetA;

import java.util.Scanner;

public class Problem263A {
	//https://codeforces.com/problemset/problem/263/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int row = 1;
		int col = 0;
		while (row <= 5) {
			String s = kbd.nextLine();
			if (s.contains("1")) {
				col = s.replaceAll(" ", "").indexOf("1") + 1;
				break;
			}
			row++;
		}
		System.out.println(Math.abs(col - 3) + Math.abs(row - 3));
		kbd.close();

	}

}
