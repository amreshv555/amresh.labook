package amresh.labook.labbook1;

import java.util.Scanner;

public class Excericse2 {

	public static void main(String[] args) {
	System.out.println("Select one of the light:");
	System.out.println("1.Red");
	System.out.println("2.Yellow");
	System.out.println("3.Green");
	
	System.out.println("Eneter the choice: ");
	Scanner sc = new Scanner(System.in);
	int choice= sc.nextInt();
	
	switch(choice) {
	case 1: 
		System.out.println("stop");
		break;
	case 2:
		System.out.println("ready");
		break;
	case 3:
		System.out.println("go");
		break;
		default:
			System.out.println("Invalid choice");
	}
	}

}
