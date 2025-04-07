package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListdemo_1 {

	public static void main(String[] args) {
		
		//default class
		//dynamic array
		/*	
		int i[] = new int[4];
		
		i[0]  = 100;
		
	    //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 4
		//at CollectionFramework/ArrayListConcept.ArrayListdemo.main(ArrayListdemo.java:13)
		
		i[-1] = 200;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		*/
		
		
		//default generics
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add(100);//0
		ar.add(200);//1
		ar.add("testing");//2
		ar.add('t');//3
		ar.add(12.33);//4
		ar.add(true);//5
		
		System.out.println(ar);
		
		System.out.println(ar.get(3));
		//System.out.println(ar.get(-1));//ArrayIndexOutOfException
		//System.out.println(ar.get(6));//Index 6 out of bounds for lenOfBoundgth 6
		
		//System.out.println(ar.remove(0));
		
		System.out.println(ar.size());
		
		System.out.println("LI = " + 0);
		System.out.println("HI = " + (ar.size()-1));
		
		ar.add(400);//6
		ar.add(500);//7
		System.out.println(ar.size());
		
		
		//list with other collection:
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java", "Python", "JS", "PHP"));
		System.out.println(names);
		System.out.println(names.size());

	}

}
