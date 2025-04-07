package coreJava;

import java.util.HashSet;
import java.util.Iterator;
//import javax.swing.text.html.HTMLDocument.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		
		//HashSet, treeset, Linkedhashset implements set interface
		// does npt accept duplicate values
		//There is no quarantee elements stored in sequential order..Random order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
		hs.add("INDIA");
		System.out.println(hs);
		//System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//Iterator
		Iterator<String> i = hs.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	
	}

}
