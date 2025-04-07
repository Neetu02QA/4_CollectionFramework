package coreJava;

public class childClassDemo extends parentClassdemo{

	
	public void audiosystem()
	{
		//System.out.println("new audio");
		System.out.println("new audio child");
		
	}
	public void engine()
	{
		System.out.println("new engine ");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		childClassDemo cd = new childClassDemo();
		cd.colour();
		cd.brakes();
		cd.audiosystem();//function overriding both hv method and signature and same name
		
		
	}

}
