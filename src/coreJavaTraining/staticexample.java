package coreJavaTraining;

public class staticexample {
	
	static String name;
	static String address;
	
	public static void intialize(String name, String address)
	{
		
		staticexample.name=name;
		staticexample.address=address;
		
		System.out.println(name);
		System.out.println(address);
		
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intialize("A","B");
		
		
	}

}
