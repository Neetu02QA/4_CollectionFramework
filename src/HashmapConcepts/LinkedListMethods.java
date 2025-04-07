package HashmapConcepts;

import java.util.Collections;
import java.util.LinkedList;
import java.util.jar.Attributes.Name;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		//LL is a default class in Java
		//it can be used as List, Stack, Queue
		//it allows the null entry
		//dynamic collection
		//hence insertion and deletion can be easily implemented
		//it can contain duplicate elements
		//it is not synchronized(not thread safe)
		//in LL, manipulation is fast because we don need any shifting.
		
		//LL constructors:
		//LinkedList(Collection c);
		
		LinkedList<String> names = new LinkedList<String>();
		System.out.println(names.size());
		
		names.add("Tom");
		names.add("Naveen");
		
		System.out.println(names.size());
		
		System.out.println(names);
		System.out.println(names.get(1));
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		names.add(4, "Steve");
		System.out.println(names);
		
		names.add(2, "Ram");
		System.out.println(names);
		
		LinkedList<String> users = new LinkedList<String>();
		
		users.add("Peter");
		users.add("Trump");
		
		names.addAll(users);
		System.out.println(names);
		
		names.addFirst("Kamala");
		System.out.println(names);
		
		names.addLast("Shivin");
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		
		names.removeAll(users);
		System.out.println(names);
		
		names.removeFirst();
		names.removeLast();
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		LinkedList<String> lang = new LinkedList<String>();
		System.out.println(names.size());
		
		lang.add("Java");//0
		lang.add("Python");//1
		lang.add("Ruby");//2
		lang.add("JavaScript");//3
		
		System.out.println(lang.size());
		//reverse the linkedlist;
		Iterator<String> itr = lang.descendingIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		for(String e : lang) {
			System.out.println(e);
			
		}
		
		//sort:
		Collections.sort(lang);
		System.out.println(lang);
	}

}
