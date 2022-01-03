package hackerRank;

import java.util.*;

public class Staircase {

	public static void main(String[] args) {
		int n = 7;
        for(int i = 1; i <= n; i++){
            String printedLine = "";
            int numSpaces = n-i;
            for(int j = 0; j < numSpaces; j++){
                printedLine += " ";
            }
            for(int k = 0; k < i; k++){
                printedLine += "#";
            }
            System.out.println(printedLine);
        }

	}

}
