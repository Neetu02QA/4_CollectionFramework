
public class StaticVar {
	
	String name;// Instance variables
	String address;
	static String city = "Bangalore";
//	static int i = 0;
	static int i = 0;
	static{
		city="Bangalore";
		try {
			i=0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	StaticVar(String name, String address )
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
	
	public void getaddress()
	{
		System.out.println(address+" " + city);
	
	}
	public static void getCity()
	{
		System.out.println(city);
	}
	


	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("Bob", "Marathali");
		StaticVar obj1 = new StaticVar("Ram", "Jayanagar");
		obj.getaddress();
		obj1.getaddress();
		StaticVar.getCity();//static - they are object independent
//		StaticVar.i = 4;
		obj.address="xyz";
	}

}
