package viva;

import java.util.HashSet;
import java.util.Set;

public class Demo2 
{
	public static void main(String[] args) 
	{
		 String str="I love java and I love java automation";
		 String[] words=str.toLowerCase().split("\\s");
		 
		 Set<String> seen=new HashSet<>();
		 Set<String> duplicate=new HashSet<>();
		 
		 for(String word :words)
		 {
			 if(!seen.add(word))
			 {
				 duplicate.add(word);
			 }
		 }
		 System.out.println("duplicate word is:");
		 for(String word: duplicate)
		 {
			 System.out.println(word);
		 }
		 
}
}