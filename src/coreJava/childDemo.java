package coreJava;

public class childDemo extends parentDemo{

	String name ="QAClickAcademy";//child class variable
	
	//child class constructor
	public childDemo()
	{
		super(); // this should be always be first line
				// thsi is using parent constructor
		System.out.println("child class constructor");
	}
	
	public void getStringdata() 
	{
		System.out.println(name);//fetch child class variable
		System.out.println(super.name);
	}
	
	
	//this method overide parent class
	public void getData()
	{
		super.getData();//this one directly fetch data from parent data
		System.out.println("I am in child class");
	}
	public static void main(String[] args) {
		
		childDemo cd = new childDemo();
		
		cd.getStringdata();
		cd.getData();
	}

}
