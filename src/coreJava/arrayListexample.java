package coreJava;

import java.util.ArrayList;

public class arrayListexample {
	
	//can accept duplicate values
	//ArrayList, linkedList, vector - implementing List Interface
	//Array has fixed size where as arrayList can grow dynamically
	//you can access and insert any value in any index
	public static void main(String[] args) {
		//array list has dynamic size whether increment or decremnet
		//ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("Rahul");
		a.add("Java");
		a.add("Java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
//		a.remove(1);
//		a.remove("Java");
//		System.out.println(a);

		System.out.println(a.get(2));
		//testing
		System.out.println(a.contains("testing"));
		System.out.println(a.contains("Java"));
		System.out.println(a.contains("testing"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
}
}