package codeJam2019;

import java.util.Scanner;
import java.util.ArrayList;

public class ForgoneSolution {
	
	//https://codingcompetitions.withgoogle.com/codejam/round/0000000000051705/0000000000088231
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);

		ArrayList<String> input = new ArrayList<String>();

		int cases = kbd.nextInt();
		for (int i = 0; i < cases; i++) {
			input.add(kbd.next());
		}

		for (int i = 0; i < input.size(); i++) {
			String b = "";
			boolean start = false;
			for (int j = 0; j < input.get(i).length(); j++) {
				if (input.get(i).charAt(j) == '4') {
					start = true;
					input.set(i, input.get(i).replaceFirst("" + input.get(i).charAt(j), "2"));
					b += "2";
				} else if (start) {
					b += "0";
				}
			}
			System.out.println("Case #" + (i + 1) + ": " + input.get(i) + " " + b);
		}

		kbd.close();
	}

}

/**
Testing Inputs: 
3
4
940
4444
 */
