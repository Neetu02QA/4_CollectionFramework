package OOP;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		
		Map<Employee, String> empMap = new HashMap();
		
		Employee e1 = new Employee("Naveen", 20);
		
		empMap.put(e1, "Permanent");
		e1.setAge(25);
		
		//empMap.put(e1, "Temp");
		
		System.out.println(empMap.get(e1));
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		String e11 = "Tom";
		m1.put(e11, 100);
		System.out.println(m1.get(e11));
		
		e11 = "Naveen";
		m1.put(e11, 200);
		System.out.println(m1.get(e11));
		System.out.println(m1.get("Tom"));

		
//		m1.put("Tom", 100);
//		System.out.println(m1.get("Tom"));
//		
//		m1.put("Naveen", 200);
//		System.out.println(m1.get("Naveen"));
//		System.out.println(empMap.get("Tom"));
//	
	}

}
