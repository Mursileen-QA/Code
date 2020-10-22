package coreJavaTraining;

public class ChildDemo extends ParentDemo  {
	//String name="child";
	
	
	public ChildDemo()
	{
		super();
		System.out.println("CC");
		
		
	}
	
	
	public void getname()
	{
		
		System.out.println(name);
		
	}
	
	public void getdata()
	{
	
		super.getdata();
		System.out.println("Child Method");
		
	}

	public static void main(String[] args) {
		
		ChildDemo cd = new ChildDemo();
		cd.getname();
		cd.getdata();
		
		// TODO Auto-generated method stub

	}

}

//Super Keyword used to differetiate between parent child 
