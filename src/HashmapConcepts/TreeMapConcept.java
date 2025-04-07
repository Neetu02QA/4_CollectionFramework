package HashmapConcepts;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

	public static void main(String[] args) {
	
		TreeMap<Integer, String> map = new TreeMap<>();
		
		map.put(1000, "Tom");
		map.put(2000, "Peter");
		map.put(3000, "Steve");
		map.put(11000, "Naveen");
		map.put(1400, "Robby");
		
		System.out.println(map);
		
		map.forEach((k,v) -> System.out.println("key" + k + "and value = " + v));
		
		System.out.println("-----------------------------");
		
		System.out.println(map.lastKey());
		
		System.out.println("-----------------------------");
		
		System.out.println(map.firstKey());
		
		System.out.println("-----------------------------");
		
		Set<Integer> keysLessThan3k = map.headMap(3000).keySet();
		System.out.println(keysLessThan3k);
		
		System.out.println("-----------------------------");
		
		Set<Integer> keysLessGr3k = map.headMap(3000).keySet();
		System.out.println(keysLessGr3k);
		
		System.out.println("-----------------------------");
		
		TreeMap<String, Integer> Usermap = new TreeMap();
		Usermap.put("James", 100);
		Usermap.put("Brad", 200);
		Usermap.put("Albert", 400);
		Usermap.put("George", 50);
		Usermap.put("Larry", 900);
		Usermap.put("Ted", 120);
		Usermap.put("Paul", 300);
		
		Usermap.forEach((k,v) -> System.out.println("key = " + k + "and value = " + v));
		

		System.out.println("-----------------------------");
		
		TreeMap<Integer, String> map1 = new TreeMap<>(Comparator.reverseOrder());
		
		map1.put(1000, "Tom");
		map1.put(2000, "Peter");
		map1.put(3000, "Steve");
		map1.put(11000, "Naveen");
		map1.put(1400, "Robby");
		
		System.out.println(map1);
	}

}
