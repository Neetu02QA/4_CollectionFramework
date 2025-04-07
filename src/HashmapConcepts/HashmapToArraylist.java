package HashmapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashmapToArraylist {

	public static void main(String[] args) {
		
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Walmart", 20000);
		compMap.put("Amazon", 30000);
		compMap.put("Facebook", 5000);
		compMap.put("Cisco", 15000);
		
		System.out.println("comp map size: " + compMap.size());
		
		Iterator it = (Iterator) compMap.entrySet().iterator();
		
		while(((java.util.Iterator<Entry<String, Integer>>) it).hasNext()) {
			
			Map.Entry pairs = (Map.Entry)it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
			
		}
		
		System.out.println("----------------------------");
		
		compMap.forEach((k,v) -> System.out.println("key = " + k + "value = " + v));
		
		//convert hashmap keys into ArrayList;
		List<String> compNamesList = new ArrayList<String>();
		
		for(String t : compNamesList) {
			System.out.println(t);
		}
		
		System.out.println("------------------------------");
		
		//convert hashmap values into ArrayList;
		List<Integer> EmpValuesList = new ArrayList<Integer>();
		for(Integer e : EmpValuesList) {
			System.out.println(e);
		}
	}

}
