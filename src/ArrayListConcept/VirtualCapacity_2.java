package ArrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity_2 {

	public static void main(String[] args) {
		
		//default capacity is array = 10
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		System.out.println(ar.size());//PC = 0
		
		ar.add(100);//0
		
		System.out.println(ar.size());//PC = 1
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());//PC = 4
		
		
	}

}
