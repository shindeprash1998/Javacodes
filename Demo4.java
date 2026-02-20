package viva;

public class Demo4 
{
	public static void main(String[] args) 
	{
		 String input="i love java";
		 String[] words=input.split(" ");
		 
		 for(String word:words)
		 {
			 for(int i=word.length()-1;i>=0;i--)
			 {
				 System.out.print(word.charAt(i));
			 }
		 }
		  System.out.print(" ");
	}

}
