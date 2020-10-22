package CoreJavaII;

import java.util.HashSet;
import java.util.Iterator;



public class hashex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs = new HashSet<Integer>();

		for(int i=0; i<=100; i++)
		{
			
			hs.add(i);
		}
		
		hs.removeAll(hs);
		
	
		Iterator<Integer> it= hs.iterator();
		
		while(it.hasNext())
		{
		
		System.out.println(it.next());
		
		}
		

	}

}
