package problemSetA;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem339A {

	// https://codeforces.com/problemset/problem/339/A
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		String input = kbd.nextLine();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != '+') {
				arrList.add(Integer.parseInt(input.substring(i, i + 1)));
			}
		}
		sortArrayList(arrList);
		int numPlusSigns = arrList.size() - 1;
		String output = "";
		output += arrList.get(0);
		int count = 1;
		while (numPlusSigns != 0) {
			output += "+";
			output += arrList.get(count);
			count++;
			numPlusSigns--;
		}
		System.out.println(output);
		kbd.close();

	}
	
	//Bubble Sort Implementation
	public static void sortArrayList(ArrayList<Integer> arrList) {
		boolean isSorted = false;
		int lastUnsorted = arrList.size() - 1;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < lastUnsorted; i++) {
				if (arrList.get(i) > arrList.get(i + 1)) {
					int temp = arrList.get(i);
					arrList.set(i, arrList.get(i + 1));
					arrList.set(i + 1, temp);
					isSorted = false;
				}
			}
			lastUnsorted--;
		}
	}

}
