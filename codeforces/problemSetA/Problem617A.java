package problemSetA;

import java.util.Scanner;

public class Problem617A {

	public static void main(String[] args) {
		//https://codeforces.com/problemset/problem/617/A
		Scanner kbd = new Scanner(System.in);
		int location = kbd.nextInt();
		int steps = 0;
		while(location > 5) {
			steps++;
			location -= 5;
		}
		if(!(location <= 0))
			steps++;
		System.out.println(steps);
		kbd.close();
		
	}

}
