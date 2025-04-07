package HashmapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapInitilization {
		
		private static final Map<String, Integer> ImmutableMap = null;
		public static Map<String, Integer>marksMap;
		
	static {
		marksMap = new HashMap<>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
		
	}
		
	public static void main(String[] args) {
		
		//1. using HashMap class
		HashMap<String, String> map1 =new HashMap<>();
		Map<String, String> map2 =new HashMap<>();
		
		//2.static way : static hashmap
		System.out.println(HashMapInitilization.marksMap.get("A"));
		
		//3. ImmutableMap with only one single entry:
		Map<String, Integer> map3 = Collections.singletonMap("Test", 100);
		System.out.println(map3.get("test"));
		//map3.put("abc", 200);//UnsupportedoperationException
		
		//4. JDK 8;
		//creating one 2D array of Strings using stream and collection in the form of map
		Map<String, String> map4 = Stream.of(new String [][]{
				
				{"Tom", "A Grade"},
				{"Naveen", "A+ Grade"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		map4.put("Lisa", "A++ Grade");
		System.out.println(map4.get("Lisa"));
//*********************************************************************	
	
		//using SimpleEntry: 
				Map<String, String> map5 = Stream.of(
					new AbstractMap.SimpleEntry<>("Naveen", "Java"),
					new AbstractMap.SimpleEntry<>("Tom", "Python")
					
					).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				System.out.println(map5.get("Naveen"));
				map5.put("Lisa", "c#");
				System.out.println(map5.get("Lisa"));
			
		//using SimpleEntry: Immutable map;
		Map<String, String> map6 = Stream.of(
			new AbstractMap.SimpleEntry<>("Naveen", "Java"),
			new AbstractMap.SimpleEntry<>("Tom", "Python")
			
			).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(map6.get("Tom"));
		map6.put("Steve", "Ruby");
		System.out.println(map6.get("Steve"));
	
	    //JDK 1.9:
		//empty map:
		Map<String, String> map7 = Map.of("k1","v1","k2","v2","k3","v3");
		
		Map.ofEntries(
				new AbstractMap.SimpleEntry<>("A", 100),
				new AbstractMap.SimpleEntry("B", 200),
				new AbstractMap.SimpleEntry("C", 300)
				);
		
		System.out.println(map7.get("C"));
		//map7.put("D", 400); //UnsupportedOperationException
		
		
		//maps using Guava:
		Map<String, String> titleMaps = Map.of("Google", "Google India", "Amazon", "Amazon Shopping");
		titleMaps.put("rediff", "Rediff India");//UnsupportedOperationException
	}

}
