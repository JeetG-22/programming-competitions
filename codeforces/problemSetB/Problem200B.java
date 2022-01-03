package problemSetB;

import java.util.Scanner;

public class Problem200B {

	public static void main(String[] args) {
		// https://codeforces.com/problemset/problem/200/B
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		kbd.skip("[\r\n]+");
		String input2 = kbd.nextLine();
		double sum = 0;
		for (String num : input2.split(" ")) {
			sum += Integer.parseInt(num);
		}
		System.out.println(sum / n);
		kbd.close();

	}

}
