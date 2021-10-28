package amresh.labook.labbook1;

import java.util.Scanner;

public class Excericse7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n= sc.nextInt();
		boolean b=checkNumber(n);
		if(b==true) {
			System.out.println("The number is not increase number");
		}
		else {
			System.out.println("The number is increase number");
		}
	}

	public  static boolean checkNumber(int n) {
		boolean flag = false;
		int digit =n%10;
		n = n/10;
		while(n>0) {
			if(digit<=n%10) {
				flag = true;
			break;
			}
			digit = n%10;
			n =n/10;
		}
		if(flag==true) {
			return true;
		}
		else {
			return false;
		}
		
		
		
		
	}

}
