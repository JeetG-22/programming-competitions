package problemSetA;

import java.util.Scanner;

public class Problem977A {
	//https://codeforces.com/problemset/problem/977/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		int n = Integer.parseInt(input.substring(0, input.indexOf(" ")));
		int k = Integer.parseInt(input.substring(input.indexOf(" ") + 1));
		int i = 0;
		while (i < k) {
			if (n % 10 == 0)
				n /= 10;
			else
				n--;
			i++;
		}
		System.out.println(n);
		kbd.close();
	}
}
