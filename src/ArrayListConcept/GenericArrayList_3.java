package ArrayListConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class GenericArrayList_3 {
	
	//In this array list only integer I can add
	
	public static void main(String[] args) {
		//This "Integer" is called generics in array list
		ArrayList<Integer> marksList = new ArrayList<Integer>();	
		marksList.add(100);
		//marksList.add(100.2);
		ArrayList<Double> arD = new ArrayList<Double>();	
		arD.add(12.33);
		//arD.add(100);//This is nt  correct
		//The method add(int, Double) in the type 
		//ArrayList<Double> is not applicable for the 
		//arguments (int)

		arD.add(100.0);
		
		ArrayList<String> studentNames = new ArrayList<String>();	
		studentNames.add("Tom");
		
		//ArrayList or all the collections only store objects not primitive datat types
		//if u want add 100 primitive value then u have create a wrapper class
		//then it will do autoboxing and up casting into integer
		//This is generic array generics
	}

}
