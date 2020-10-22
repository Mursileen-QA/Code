package coreJavaTraining;

public class Constructor {
	
	
	//Default Constructor
	//public Constructor()
	//{
		
		//System.out.println("I am Constructor");
		
		
	//}
	
	//public Constructor(int a)
	//{
		
		//System.out.println("I am Constructor B" + a );
		
		
	//}
	
	
	public Constructor(int a, int b)
	{
		
		System.out.println("I am param Constructor");
		
		
	}
	
	public void getdata()
	{
		
		System.out.println("I am Method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constructor obj= new Constructor(1);
		//Constructor obj2= new Constructor(1, 2);

		
	//if any contructor is defined explicitly, java complier will not look
		//for any implict constructor, it works only when NO constructors are defined
		//if any explict constructor, java will look for any version of contructor defined.
		
		
	}

}
