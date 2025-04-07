package coreJava;

public class constructDemo {

	
	public constructDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture");
		
	}
	
	// Parameterized constructor
	
	public constructDemo(int a, int b)
	{
		System.out.println("I am in parameterized constructor");
		int c= a+b;
		System.out.println(c);
	}
	
	public constructDemo(String str )
	{
		System.out.println(str);
		
	}
	
	
	public void getData() 
	{
		System.out.println("I m method");
	}

	//will not return values
	//name of constructor should be the class name
	
	
	public static void main(String[] args) {
		
		constructDemo cd = new constructDemo("hello");
//		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4,5);
		
		// compiler will call implicit constructor if u have not defined constructor block
		//whenver you create an object constructor is called
		//block of code when ever an object is created
		
	}

}
