package abc;

import java.util.ArrayList;
import java.util.Collections;

public class Coll {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
