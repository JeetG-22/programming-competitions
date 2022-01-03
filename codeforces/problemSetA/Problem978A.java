package problemSetA;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem978A {
	// https://codeforces.com/problemset/problem/978/A
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		Scanner kbd = new Scanner(System.in);
		kbd.nextLine();
		for (String s : kbd.nextLine().split(" ")) {
			aList.add(Integer.parseInt(s));
		}

		for (int i = aList.size() - 1; i > 0; i--) {
			System.out.println("------" + aList.get(i));
			for (int j = i - 1; j >= 0; j--) {
				System.out.println(aList.get(j) + "--------");
				if (aList.get(i) == aList.get(j)) {
					System.out.println(j);
					aList.remove(j);
					break;
				}
			}
		}

		// Print
		System.out.println(aList.size());
		for (int i = 0; i < aList.size(); i++) {
			System.out.print(aList.get(i) + " ");
		}
		kbd.close();
	}

}
