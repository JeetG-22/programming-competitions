package problemSetA;

import java.util.Scanner;

public class Problem791A {
	//https://codeforces.com/problemset/problem/791/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		int a = Integer.parseInt(input.substring(0, input.indexOf(" ")));
		int b = Integer.parseInt(input.substring(input.indexOf(" ") + 1));
		int count = 0;
		while (a <= b) {
			count++;
			a *= 3;
			b *= 2;
		}
		System.out.println(count);
		kbd.close();

	}

}
