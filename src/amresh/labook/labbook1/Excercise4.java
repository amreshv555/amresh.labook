package amresh.labook.labbook1;

import java.util.Scanner;

public class Excercise4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n= sc.nextInt();
		for(int start=0;start<=n;start++) {
			int temp = start;
		int i=2;
		for( ;i<=temp;i++) {
			if(temp%i==0) {
				break;
			}
		}
		
		if(temp==i) {
			System.out.println(i+" ");
		}
		}
	}

}
