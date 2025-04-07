
public abstract class ParentAirCraft {
	
	public void engine()
	{
		System.out.println("Follow Engine Guidelines");
	}
	
	
	//u cannt have private modifier in abstract class
	//u can have public or protected
	public void safetyGuidelines()
	{
		System.out.println("Follow safety Guidelines");
	}
	
	public abstract void bodyColor();

}
