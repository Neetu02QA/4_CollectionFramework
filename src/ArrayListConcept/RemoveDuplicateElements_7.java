package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements_7 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,14,5,6,1,7,8,9,7));
		
		//1. LinkedhashSet
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers); //linkehashset is reference name
		
		ArrayList<Integer> numbersListWithtoutduplicates = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numbersListWithtoutduplicates);
		
		//2. JDL 8 - stream
		
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,14,5,6,1,7,8,9,7));
		List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
		
		
		

	}

}
