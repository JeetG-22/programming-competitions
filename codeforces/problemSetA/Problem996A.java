package problemSetA;

import java.util.Scanner;

public class Problem996A {
	//https://codeforces.com/problemset/problem/996/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int amount = kbd.nextInt();
		int count = 0;
		while (amount != 0) {
			if (amount % 100 != amount)
				amount -= 100;
			else if (amount % 20 != amount)
				amount -= 20;
			else if (amount % 10 != amount)
				amount -= 10;
			else if (amount % 5 != amount)
				amount -= 5;
			else
				amount--;
			count++;
		}
		System.out.println(count);
		kbd.close();
	}

}

