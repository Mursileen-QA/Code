import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		

		hm.put(1, "Hello");
		hm.put(2, "i");
		hm.put(3, "Hjkkjkj");
		hm.put(4, "");
		
		
		Set<Entry<Integer, String>> sn= hm.entrySet();
		Iterator<Entry<Integer, String>> it=sn.iterator();
		
		while(it.hasNext())
		{
			
		Map.Entry mp=(Map.Entry)it.next();
			
		System.out.println(mp.getValue());	
		System.out.println(mp.getKey());
		}
		
		
		
	}

}
