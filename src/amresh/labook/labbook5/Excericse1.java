package amresh.labook.labbook5;

import java.util.Scanner;

public class Excericse1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the age: ");
		int age =sc.nextInt();
		sc.close();
	try { 
		checkEligibility(age);
		}
	catch(ArithmeticException ae) {
		System.out.println("YOUR ARE NOT ELIGIBLE TO VOTE");
	}
	}

	private static void checkEligibility(int age) {
		if(age<15) {
			throw new ArithmeticException("Your not eligible to vote");
		}
		else {
			System.out.println("Your are eligible to vote");
		}
		
		
	}

}
