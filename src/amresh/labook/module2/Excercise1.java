package amresh.labook.module2;

public class Excercise1 {
	
	public static int getSecondSmallest(int[] n) {
	int temp;
	for (int i = 0; i< n.length; i++)   
    {  
        for (int j = i + 1; j <n.length; j++)   
        {  
            if (n[i] > n[j])   
            {  
                temp = n[i];  
                n[i] = n[j];  
                n[j] = temp;  
            }  
        }  
    }  
		return n[1];
	}

	public static void main(String[] args) {
		int [] n= {1,2,3,4,5};
		int j= getSecondSmallest(n);
		System.out.println("The secod smallest element is "+j);
		

	}

}
