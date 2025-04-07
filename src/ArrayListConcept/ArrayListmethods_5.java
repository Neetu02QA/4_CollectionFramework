package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListmethods_5 {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("python");
		ar1.add("ruby");
		ar1.add("javascript");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar1.add("testing");
		ar1.add("dev ops");
		
//		ar1.addAll(ar2);
		
//		System.out.println(ar1);
//		
//		ar1.addAll(2, ar2);
//		System.out.println(ar1);

//		ar1.clear();
//		System.out.print(ar1);
		
		ArrayList <String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("python"));
		
		
		System.out.println(ar1.contains("c"));
		
		System.out.println(ar1.indexOf("ruby")>0);
		
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Naveen","Steve", "Lisa"));
		System.out.println(list1);
		
		
		int i =list1.lastIndexOf("Naveen");
		System.out.print(i);
		
//		list1.remove(2);
		
		list1.remove("Lisa");
		
		System.out.println(list1);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num%2 ==0);
	
		System.out.println(numbers);
		
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList("Naveen", "Tom", "Naveen","Steve", "Lisa", "Tom"));
		System.out.println(namesList);
		
		namesList.retainAll(Collections.singleton("Tom"));
		System.out.println(namesList);
		
		ArrayList<Integer> numbers1 = new ArrayList<Integer>
				(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13));
		
		ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(2,6));
		System.out.println(subList);
		
		ArrayList<String> newList = new ArrayList<String>(
				Arrays.asList("Naveen", "Tom", "Naveen","Steve", "Lisa", "Robert"));
		
		Object arr[] = newList.toArray();//static array is written here
		System.out.println(Arrays.toString(arr));
		
		for(Object o : arr) {
			System.out.println((String)o);
		}
		
	}

}
