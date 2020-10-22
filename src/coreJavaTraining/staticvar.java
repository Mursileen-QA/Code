package coreJavaTraining;

public class staticvar {
	
	String name; //instance Varaibles
	String address;
	static String city; 
	static int i;
	
	static
	{
		
		city="srinagar";
		i=7;
		
		
	}
	
	
	staticvar(String name, String address)
	{
		this.name=name; //This refer to class variables.
		this.address=address;
		i++;
		System.out.println(i);
		
		
	}
	
	public void getaddress()
	{
		
		
		System.out.println(address + "" + city);
		
	}
	
	public static void getcity()//Class Methods.
	{
		
		System.out.println(city);
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		staticvar obj= new staticvar("mursee", "lal chowk");

		staticvar obj2= new staticvar("nazim", "banglore");
		
obj.getaddress();
obj2.getaddress();

getcity();
i=7;
System.out.println(i);


	}

}
