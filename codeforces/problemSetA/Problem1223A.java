package problemSetA;

import java.util.Scanner;

public class Problem1223A {

	public static void main(String[] args) {
		// https://codeforces.com/problemset/problem/1223/A
		Scanner kbd = new Scanner(System.in);
		int queries = kbd.nextInt();
		for (int i = 0; i < queries; i++) {
			int n = kbd.nextInt();
			int sum = (int) Math.ceil(n / 2.0);
			int oper1 = n - sum;
			if(sum == oper1 && sum == 1) {
				System.out.println(2);
			}
			else if(sum == oper1) {
				System.out.println(0);
			}
			else {
				System.out.println(1);
			}
		}
		kbd.close();
	}

}
