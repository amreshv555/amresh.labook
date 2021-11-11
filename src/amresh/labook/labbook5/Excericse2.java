package amresh.labook.labbook5;

import java.util.Scanner;

public class Excericse2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the First name");
		
		String firstName = sc.next();
		System.out.println("eneter the last name");
		String lastName = "";
		sc.close();
		try{
			checkName(firstName, lastName);
		}
		catch(NullPointerException np) {
			System.out.println("one of the name is blank");
		}
		}

	

	private static void checkName(String firstName, String lastName) {
		if(firstName=="" || lastName=="") {
			throw new NullPointerException("One of the name is blank");
		}
		else {
			System.out.println("you have given complete name");
		}
		
	}

}
