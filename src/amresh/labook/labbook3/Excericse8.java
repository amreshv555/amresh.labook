package amresh.labook.labbook3;

import java.util.Scanner;

public class Excericse8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		sc.close();
		if(positiveString(s)) 
			System.out.println("The String is positive ");
			else 
				System.out.println("the String is negative");
		
			}

	private static boolean positiveString(String s) {
		s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i<s.length()-1 && (int)s.charAt(i)<(int)s.charAt(i + 1)) {
				count++;
			}
		}
		count++;
		if (count == s.length())
			return true;
		return false;
	}

}
