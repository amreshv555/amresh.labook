package amresh.labook.module2;

import java.util.Arrays;
import java.util.Scanner;

public class Excericse2 {
	static int size;

	public static void main(String[] args) {

		System.out.println("enter the no of elements");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		System.out.println("enter the words");
		String[] a = new String[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.next();
		}
		sortStrings(a);
	}

	public static void sortStrings(String[] a) {
		Arrays.sort(a);
		int n = a.length;
		if (size % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				a[i] = a[i].toUpperCase();
			}
		} else {
			for (int i = 0; i < (n / 2) + 1; i++) {
				a[i] = a[i].toUpperCase();
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
