package SetConcepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetConcepts {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		
		hs.add("alpha");
		hs.add("testing");
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Alpha");
		hs.add(null);
		
		System.out.println(hs);
		System.out.println(hs.contains("testing"));
		
		for(String e : hs) {
			System.out.println(e);
		}
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.remove("Beta");
		System.out.println(hs);
		
		Set<Integer> first = new HashSet<Integer>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,8,9,10}));//adding interger to the array list
		
		Set<Integer> second = new HashSet<Integer>();
		second.addAll(Arrays.asList(new Integer[] {1,3,5,6,0,9}));
		
		//get the union
		Set<Integer> union = new HashSet<Integer>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("_______________________________________");
		Set<Integer> intersection = new HashSet<Integer>(first);//all common elemen ts will display
		
		
		
		intersection.retainAll(intersection);
		System.out.println(intersection);
		
		//get the difference
		Set<Integer> diff = new HashSet<Integer>(first);
		diff.removeAll(second);
		System.out.println(diff);
	} 

}

/* Hash Set
 * 
 * https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/HashSet.html
 * 
 * 
public HashSet()
Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).



public HashSet(Collection<? extends E> c)
Constructs a new set containing the elements in the specified collection. The HashMap is created with default load factor (0.75) and an initial capacity sufficient to contain the elements in the specified collection.
Parameters:
c - the collection whose elements are to be placed into this set
Throws:
NullPointerException - if the specified collection is null


public HashSet(int initialCapacity,
		 float loadFactor)
		Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and the specified load factor.
		API Note:
		To create a HashSet with an initial capacity that accommodates an expected number of elements, use newHashSet.
		Parameters:
		initialCapacity - the initial capacity of the hash map
		loadFactor - the load factor of the hash map
		Throws:
		IllegalArgumentException - if the initial capacity is less than zero, or if the load factor is nonpositive
		
		
		public HashSet(int initialCapacity)
Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and default load factor (0.75).
API Note:
To create a HashSet with an initial capacity that accommodates an expected number of elements, use newHashSet.
Parameters:
initialCapacity - the initial capacity of the hash table
Throws:
IllegalArgumentException - if the initial capacity is less than zero
		
		*/
