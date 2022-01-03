package problemSetA;

import java.util.Scanner;

public class Problem705A {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int n = kbd.nextInt();
		String oddFeeling = "I hate ";
		String evenFeeling = "I love ";
		String middleWord = "that";
		String endWord = "it";
		String result = "";
		int count = 1;
		while (count <= n) {
			if (count % 2 == 1) {
				result += oddFeeling;
			} else {
				result += evenFeeling;
			}
			if (count == n) {
				result += endWord + " ";
			} else {
				result += middleWord + " ";
			}
			count++;
		}
		result.trim();
		System.out.println(result);
		kbd.close();

	}

}
