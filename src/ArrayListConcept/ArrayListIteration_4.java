package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration_4 {

	public static void main(String[] args) {
	
		ArrayList<String> studentList = new ArrayList<String>();
		
		studentList.add("Tom");//0
		studentList.add("Naveen");//1
		studentList.add("Steve");//2
		studentList.add("Lisa");//3
		
		
		//I want to iterate value
		//typical for loop:
		for(int i=0; i<studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		
		System.out.println("------------------------");
		
		//make a variable n write object name of ur list
		//for each loop:
		for(String s : studentList) {
			System.out.println(s);
					
		}
		System.out.println("------------------------");
		
		//JDK 8 - streams with lambda:
		//another way to get values of list
		studentList.stream().forEach(ele -> System.out.print(ele));
		
		System.out.println("------------------------");
		
		//iterator:
		//Iterator is an interface which is used to iterate values from collection...java. util package..creating reference type
		Iterator<String> it = studentList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
	}

}
