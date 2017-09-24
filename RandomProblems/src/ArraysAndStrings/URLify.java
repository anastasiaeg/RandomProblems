package ArraysAndStrings;

import java.util.Scanner;

public class URLify {
	public static void main(String[] args) {
		System.out.println(scan("Mr John Smith     "));
	}
	
	public static String scan(String input) {
		Scanner s = new Scanner(input);
		boolean first = true;
		StringBuilder output = new StringBuilder();
		while (s.hasNext()) {
			if (!first) output.append("%20");
			output.append(s.next());
			first = false;
		}
		s.close();
		return output.toString();
	}
}
