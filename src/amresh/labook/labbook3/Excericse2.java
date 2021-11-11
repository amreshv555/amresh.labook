package amresh.labook.labbook3;

import java.util.Scanner;

public class Excericse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string:");
		String s = sc.next();
		sc.close();
		String [] str = s.split(" ");
		System.out.println(str.length);
		if(str.length<=1) {
			StringBuffer st = new StringBuffer(str[0]);
			System.out.println(s + '|' + getImage(st));
//			String str1 = getImage(str[0]);
//			System.out.println("The mirror image of the string is "+s+'|'+str1);
		}
		else {
			System.out.println("the length of String excced more than one");
		}
	}

	public static StringBuffer getImage(StringBuffer str) {
		
		return str.reverse();
//		StringBuffer str1 = new StringBuffer(str);
//	
//		for(int i=str1.length()-1;i>=0;i--) {
//			str1.append(str1.charAt(i));
//		}
//		String st = new String(str1);
//		return st;
//		
		
	}

}
