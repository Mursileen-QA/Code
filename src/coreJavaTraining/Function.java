package coreJavaTraining;

public class Function {
	
	//Function overloading same name but overloading using different parameters
	
	public void A(int a)
	{
		
		System.out.println(a);
		
		
	}
	
	
	public void A(String a)
	{
		
		System.out.println(a);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Function f = new Function();
		
		f.A("Hello");
		
	}

}
