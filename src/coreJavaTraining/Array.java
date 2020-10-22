package coreJavaTraining;

public class Array {
	
	 private void success()
	{
		System.out.println("hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6,8,9,88};
		
		//System.out.println("Length of Array"+ a.length);
		
		
		for(int i=0; i <a.length; i++)
		{
			
			//System.out.println(a[i]);
			
			
		}
		
		int b[][]= new int[2][3];
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[1][0]=5;
		b[1][1]=6;
		b[1][2]=7;
		
	
		int row=b.length;
		
		for(int i=0;i< 2; i++)
		{
			
			
			for(int j=0; j<3; j++ )

			{
				
				System.out.println(b[i][j]);
				
			}
			
			System.out.println("********************");
				
				
		}
			
			
		
		
		
	}

}
