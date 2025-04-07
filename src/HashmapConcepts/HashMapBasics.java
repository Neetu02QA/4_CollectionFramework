package HashmapConcepts;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//no order - no indexing
		//stores values -- Key-Value <k,v>
		//key can not be duplicate
		
		HashMap<String, String> capitalMap =new HashMap<String, String>();
		
		capitalMap.put("India", "Delhi");
		capitalMap.put("USA", "Washington DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put("null", "berlin");
		capitalMap.put("null", "LA");
		capitalMap.put("Russia", "null");
		capitalMap.put("France", "null");
		capitalMap.remove("France");
		
		System.out.println(capitalMap.get("USA"));
		System.out.println(capitalMap.get("Germany"));// vil give null value
		System.out.println(capitalMap.get("UK"));
		
		System.out.println(capitalMap.get(null));

		System.out.println(capitalMap.get("France"));
		
		//iterator:
		Iterator<String> it = capitalMap.keySet().iterator();//hashmap doesnot have iterator method for that keyset we are using
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = " + key + "value = " + value);
			
		//iterator: over the set (pair): by using entryset
			
		Iterator<java.util.Map.Entry<String, String>> it1 = capitalMap.entrySet().iterator();
			
			while(it1.hasNext()) {
				java.util.Map.Entry<String, String> entry = it1.next();
				System.out.println("key = " + entry.getKey() + " and value = " + entry.getValue());
			}
			
		
		//iterate hashmap using java 8 for each and lambda
			
			capitalMap.forEach((k,v) -> System.out.println("key" + k + "and value = " + v));
		}
		

	}

}
