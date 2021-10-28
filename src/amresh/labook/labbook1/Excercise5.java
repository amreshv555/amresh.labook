package amresh.labook.labbook1;

import java.util.Scanner;

public class Excercise5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		
		int d=calculateSum(n);
 System.out.println("The sum of n natural number is: "+d);
	}

	public static int calculateSum(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		
		
		return sum;
		
	}

}
