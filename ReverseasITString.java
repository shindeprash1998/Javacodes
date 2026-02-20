package viva;

 public class ReverseasITString 
{
	public static void main(String[] args) 
	{
		 String input="I Love You";
	 String word[]=input.split(" ");
	 
	 for(String words : word)
	 {
		 for(int i=words.length()-1;i>=0;i--)
		 {
				 System.out.print(words.charAt(i));
			 }
	 }
		 System.out.print(" ");
//		
//		String input="Prashant";
//		String output="";
//		
//		for(int i=input.length()-1;i>=0;i--)
//		{
//			char c=input.charAt(i);
//			output=output+c;
//			
//		}
//		System.out.println("reverse:"+output);
	}

}
