package amresh.labook.labbook3;

import java.util.Scanner;

public class Excericse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int a = sc.nextInt();
		sc.close();
		System.out.println("output is :"+ modifyNumber(a));

	}

	private static int modifyNumber(int a) {
		String s= Integer.toString(a);
		char[] c = s.toCharArray();
		StringBuffer s1 = new StringBuffer();
		
		for(int i=0;i<c.length-1;i++) {
			int j= c[i];
			int k=c[i+1];
			s1.append(j-k);
		}
		String s2 =new String(s1);
		int l= Integer.parseInt(s2);
		return l;
	}

}
