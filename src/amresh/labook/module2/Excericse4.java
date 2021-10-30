package amresh.labook.module2;

import java.util.Arrays;
import java.util.Scanner;

public class Excericse4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the size");
		int size = sc.nextInt();
		System.out.println("eneter the value");
		int[] a = new int[size];
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
       int d = modifyArray(a);
       System.out.println("Modify Array: ");
       for(int i=0;i<d;i++) {
    	   System.out.print(a[i]+" ");
       }
       System.out.println("\n Array in descending order:");
       for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
       
	}

	public  static int modifyArray(int[] a) {
		
		int n = a.length;
		int j=0;
		if(n==0 ||n==1) {
		return n;
		}
		int[] temp =new int[n];
		for(int i=0;i<n-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]= a[i];
			}
		}
		temp[j++] = a[n-1];
		for(int i=0;i<j;i++) {
			a[i]=temp[i];
		}
		Arrays.sort(a);
		
		
		return j;
	}

}
