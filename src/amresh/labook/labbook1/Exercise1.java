package amresh.labook.labbook1;

public class Exercise1 {

	public static void main(String[] args) {
		int n= 10;
		digit(n);
	}

	public static void digit(int n) {
		int sum=0;
		
		for(int i=0;i<=n;i++) {
			sum=sum+i*i*i;	
		}
		System.out.println("The sum of cubes of digit is: "+sum);
		
	}

}
