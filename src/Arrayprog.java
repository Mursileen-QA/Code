
public class Arrayprog {

	public static void main(String[] args) {
		
		
		int[] arr= {1,7781,7787,7,8,88,356,3};
		int k=0;
		
	 
		for(int i=0; i< arr.length;i++)//outerloop
		{
			
			for(int j= i+ 1; j <arr.length; j++)//inner loop
			{
				
				if(arr[i]==arr[j])
				{
					
					System.out.println("Duplicate Value found: " + arr[i]);
					k=1;
					
				}
				
				
			}
			
			
			
		}
		
		if(k==0)
		{
			System.out.println("No Duplicate");
			
		}
		

	}

}
