package coreJavaTraining;

public class SpiceJet extends AircraftParent {
	
	
	public void drag()
	{
		
		System.out.println("New Drag Function in spicejet");
		
	}
	
	public void color()
	{
		
		System.out.println(color);
		
	}
	
	
	public static void main(String[] args) {
		
		
		SpiceJet obj = new SpiceJet();
		obj.safetyguidelines();
		obj.bodycolor();
		obj.engine();
		obj.drag();
		obj.color();
		
			
		
		
	}

	//ABSTRACT METHOD
	@Override
	public void bodycolor() {
		System.out.println("RED COLOR"); 
		
	}
	
	

}
