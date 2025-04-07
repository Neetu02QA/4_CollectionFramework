
public class ChildEmirites extends ParentAirCraft{

	public static void main(String[] args) {
		
		ChildEmirites c = new ChildEmirites();
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();
		
		//You cannt instatiate abstract classes or 
		//remove abstarct keyword from parent class ParentAirCraft
		
		//ParentAirCraft p = new ParentAirCraft();

	}

	@Override
	public void bodyColor() {
		System.out.println("Red color on the body");
	}

}
