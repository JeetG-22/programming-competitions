package problemSetA;

import java.util.Scanner;

public class Problem1154A {
	//https://codeforces.com/problemset/problem/1154/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		int arr[] = new int[4];
		int i = 0;
		for (String num : input.split(" ")) {
			arr[i] = Integer.parseInt(num);
			i++;
		}
		int max = Math.max(arr[0], Math.max(arr[1], Math.max(arr[2], arr[3])));
		i = 0;
		String result = "";
		while (i < 4) {
			if (arr[i] != max) {
				result += (max - arr[i]) + " ";
			}
			i++;
		}
		System.out.println(result.trim());
		kbd.close();

	}

}
