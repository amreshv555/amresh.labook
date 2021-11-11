package amresh.labook.labbook3;

import java.util.Scanner;

public class Excericse3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s = sc.next();
		sc.close();
		String [] str = s.split(" "); 
		if(str.length<2) {
			System.out.println("the new string is "+ alterString(str[0]));
		}
		
		

	}

	public  static String alterString(String string) {
		String s= string.toUpperCase();
		char[] c= s.toCharArray();

		for(int i=0;i<c.length;i++) {
			if(c[i]!='A' || c[i]!='E' || c[i]!='I' || c[i]!='O'||c[i]!='U') {
				c[i]=(char)(c[i]+1);
			}
		}
		return new String(c);
	}

}
