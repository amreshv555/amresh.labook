package amresh.labook.labbook1;

import java.util.Scanner;

public class Excericse8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		boolean b=checkNumber(n);
		if(b==true) {
			System.out.println("The number is power of 2");
		}
		else {
			System.out.println("The number is not power of 2");
		}

	}

	public static boolean checkNumber(int n) {
		
		while(n%2==0) {
			n=n/2;
		}
		if(n==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
