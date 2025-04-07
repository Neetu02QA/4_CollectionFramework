package demopack;

import java.util.ArrayList;

public class arrayListexample {

	private int i = 5;
	
//	public void abc() 
//	{
//		System.out.println("hello");
//	}
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("Java");
		a.add("Java");
		System.out.println(a);
		/*a.remove(1);
		 * a.remove(""Java");
		  System.out.print(a);
		 */
	
		//testing
		System.out.println(a.contains("Java"));
		System.out.println(a.indexOf("rahul"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}
		//public, private, protected, default -
		//default : access method anywhere only in package
		//protected : variable/method as private : you can access those in +sub classes only(other packages) ..
		//public : variable/method as public : then you will have access across all the packages.
		//private : you cannot access method or variable outside the class of same package.
		
		
		//we will try to cal/ this method  in ArrayDemo
		//if protected below method then only extent by Array demo class	
	public void abc() {
			System.out.println("hello");
		
	}

}
