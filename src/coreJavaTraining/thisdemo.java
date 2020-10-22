package coreJavaTraining;

public class thisdemo {
	
	int a=2;
	
	public void getdata()
	{
		
		
		int a=7; //Local
		int c=this.a + a;
		System.out.println(c);
		
		System.out.println(this.a);//Scope of this of Class Level.
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisdemo td = new thisdemo();
		td.getdata();
		

	}

}
