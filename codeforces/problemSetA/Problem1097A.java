package problemSetA;

import java.util.Scanner;

public class Problem1097A {
	//https://codeforces.com/problemset/problem/1097/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String card = kbd.nextLine();
		String hand = kbd.nextLine();
		boolean check = false;
		for (int i = 0; i < card.length(); i++) {
			if (hand.indexOf(card.charAt(i)) >= 0) {
				check = true;
				break;
			}
		}
		System.out.println(check ? "YES" : "NO");
		kbd.close();

	}

}
