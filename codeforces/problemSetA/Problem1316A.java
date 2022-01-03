package problemSetA;

import java.util.Scanner;

public class Problem1316A {
	//https://codeforces.com/problemset/problem/1316/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String output = "";
		int cases = kbd.nextInt();
		kbd.skip("[\r\n]+");
		for (int i = 0; i < cases; i++) {
			String fLine = kbd.nextLine();
			String sLine = kbd.nextLine();
			if (sLine.indexOf(" ") > 0) {
				int sum = Integer.parseInt(sLine.substring(0, sLine.indexOf(" ")));
				for (String j : sLine.substring(sLine.indexOf(" ") + 1).split(" ")) {
					sum += Integer.parseInt(j);
				}
				if (sum >= Integer.parseInt(fLine.substring(fLine.indexOf(" ") + 1))) {
					output += fLine.substring(fLine.indexOf(" ") + 1) + "\n";
				} else {
					output += sum + "\n";
				}
			}
			else {
				output += sLine.substring(0) + "\n";
			}
		}
		System.out.println(output.trim());
		kbd.close();

	}

}
