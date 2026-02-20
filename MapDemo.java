package viva;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
 

public class MapDemo 
{
	public static void main(String[] args)
	{
		Map<Integer,String> m=new HashMap<>();
		m.put(1, "Prashant");
		m.put(2,"deepak");
		m.put(3,"deepak");
		
		System.out.println(m);
		
		Set<Entry<Integer,String>> entries=m.entrySet();
		System.out.println("Interating through map");
		for(Map.Entry<Integer,String> entry : entries)
		{
			System.out.println(entry.getKey() + "=" +entry.getValue());
		}
		 
		
		
		
	}

}
 /*
  * 	Set<Entry<Integer,String>> entries=m.entrySet();
		System.out.println("Key values pairs fetching");
		for(Map.Entry<Integer, String> entry :entries)
		{
			System.out.println(entry.getKey() + "=" +entry.getValue());
		}
		*/
