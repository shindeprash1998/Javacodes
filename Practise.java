package viva;

import java.util.HashSet;
import java.util.Set;

public class Practise
{
	public static void main(String[] args) 
	{
		String input=" java is programming language and java widely used";
		String[] words=input.toLowerCase().split("\\s");
		
		Set<String> seen=new HashSet<>();
		Set<String> duplicate=new HashSet<>();
		
		for(String word: words)
		{
			if(!seen.add(word))
			{
				duplicate.add(word);
			}
		}
		System.out.println("The duplicates word");
	
		
		for(String word : duplicate)
		{
			System.out.println(word);
		}
		
	}

}
