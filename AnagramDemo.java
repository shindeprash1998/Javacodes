package viva;

import java.util.Arrays;

public class AnagramDemo 
{
	public static void main(String[] args)
  {
		String a="angle";
		String b="angel";
		
		if(a.length()!=b.length())
		{
			System.out.println("Its not anagram");
		}
		else
		{
			char[] c=a.toCharArray();
			char[] c1=b.toCharArray();
			
			Arrays.sort(c);
			Arrays.sort(c1);
			
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(c1));
			
		if(Arrays.equals(c, c1))
		{
			System.out.println("yes Anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
		}
		
	}

}
