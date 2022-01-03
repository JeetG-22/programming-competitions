package problemSetA;

import java.util.Scanner;

public class Problem785A {
	//https://codeforces.com/problemset/problem/785/A

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int num = kbd.nextInt();
		String[] poly = new String[num];
		int count = 0;
		while (num != count) {
			poly[count] = kbd.next();
			count++;
		}
		kbd.close();
		int sum = 0;
		for (int i = 0; i < poly.length; i++) {
			if (poly[i].equals("Icosahedron"))
				sum += 20;
			else if (poly[i].equals("Cube"))
				sum += 6;
			else if (poly[i].equals("Tetrahedron"))
				sum += 4;
			else if (poly[i].equals("Octahedron"))
				sum += 8;
			else
				sum += 12;
		}
		System.out.println(sum);

	}

}
