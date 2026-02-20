package viva;

import java.util.HashSet;
import java.util.Set;

public class Demo 
{
	public static void main(String[] args) 
	{
		 String str="prashantrraass";
		 
		 Set<Character> seen=new HashSet<>();
		 Set<Character> duplicate=new HashSet<>();
		 
		 for(char ch : str.toCharArray())
		 {
			 if(!seen.add(ch))
			 {
				 duplicate.add(ch);
			 }
		 }
		 System.out.println("duplicates char is:"+duplicate);
		 System.out.println("count char is:"+duplicate.size());
		 
		
	}

}
