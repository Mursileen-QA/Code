package CoreJavaII;

import java.util.ArrayList;

public class Arraylistex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();

		a.add("mursee");
		a.add("nazim");
		a.add(2, "rahul");
		a.add(3, "nth");
		
		try
		{
			System.out.println(a.get(4));
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
		finally
		{
			System.out.println(a);
			System.out.println(a.size());
		}
		
	
		
	
		
		
	}

}
