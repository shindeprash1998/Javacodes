package viva;

import java.util.HashSet;
import java.util.Set;

class DuplicateWordsInString
{
	 public static void main(String[] args) 
	 {
		 String input="I love India and I living in india";
		 String [] words=input.toLowerCase().split("\\s");
		 
		 Set<String> seen=new HashSet<>();
		 Set<String> duplicate=new HashSet<>();
		 
		for(String word :words)
		{
			if(!seen.add(word))
			{
				duplicate.add(word);
			}
		}
		System.out.println("the Duplicate word is");
		for(String word : duplicate)
		{
			System.out.println(word);
		}
		
	}
	   
		
		 

}
	
	

