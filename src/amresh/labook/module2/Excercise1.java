package amresh.labook.module2;

import java.util.Scanner;

public class Excercise1 {
	
	public static int getSecondSmallest(int[] n) {
	int temp;
	for (int i =0; i<n.length; i++)   
    {  
        for (int j =i + 1; j<n.length; j++)   
        {  
            if (n[i]>n[j])   
            {  
                temp =n[i];  
                n[i] =n[j];  
                n[j] =temp;  
            }  
        }  
    }  
		return n[1];
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of element");
		int size = sc.nextInt();
		int[] n = new int[size];
		for(int i=0; i<size;i++) {
			System.out.println("enter the value");
			n[i] = sc.nextInt();
		}
	
		int j= getSecondSmallest(n);
		System.out.println("The secod smallest element is "+j);
		

	}

}
