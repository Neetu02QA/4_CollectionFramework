package coreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "hello");
		hm.put(1, "Gudbye");
		hm.put(42, "morning");
//		hm.put(2, "morning");
		hm.put(3, "evening");
//		hm.put(6, null);
	
//		System.out.println(hm.get(2));
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		Set sn = hm.entrySet();
		
		Iterator it = sn.iterator();
		
		//hashtable - pass table are collections
		while(it.hasNext())
		{
//			System.out.println(it.next());//error will be thr
			Map.Entry mp = (Map.Entry)it.next();//we are castin map and entry ...I need sepearte value so I used map entry method
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		}

}
