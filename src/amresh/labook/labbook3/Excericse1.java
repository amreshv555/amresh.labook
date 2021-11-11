package amresh.labook.labbook3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Excericse1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp,sum=0;
		System.out.println("enter the value of integer");
		String s = sc.nextLine();
		sc.close();
		StringTokenizer str = new StringTokenizer(s," ");
		while(str.hasMoreTokens()) {
		    
			 temp = Integer.parseInt(str.nextToken());
			 System.out.print(temp+" ");
			sum += temp;
		}
         System.out.println("\n the sum of integer is "+ sum);
	}

}
