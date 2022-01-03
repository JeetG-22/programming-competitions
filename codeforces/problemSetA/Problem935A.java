package problemSetA;

import java.util.Scanner;

public class Problem935A {

	public static void main(String[] args) {
		//https://codeforces.com/problemset/problem/935/A
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		int count = 0;
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		kbd.close();

	}

}
