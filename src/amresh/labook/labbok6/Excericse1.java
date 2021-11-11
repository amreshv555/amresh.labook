package amresh.labook.labbok6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Excericse1 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(100, 1234);
		map.put(20, 1234);
		map.put(304, 124);
		map.put(40, 126734);
		map.put(50, 123423);
		map.put(607, 14234);
		map.put(70, 125634);
		System.out.println(map);
		getValues(map);
	}

	private static void getValues(Map<Integer, Integer> map) {
		List<Map<Integer,Integer>> list = new ArrayList<>();
		list.add(map);
		System.out.println(list);
	//	Collections.sort(list);

	}

}
