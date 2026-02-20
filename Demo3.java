package viva;

public class Demo3 
{
	public static void main(String[] args) 
	{
		 String input="madam";
		 String output="";
		 
		 for(int i=input.length()-1;i>=0;i--)
		 {
			 char c=input.charAt(i);
			 output=output+c;
		 }
		 System.out.println("reverse string is:"+output);
		 
		 if(input.equals(output))
		 {
			 System.out.println("yes palindrome string");
		 }
		 else
		 {
			 System.out.println("not a palindrome");
		 }
		 
	}

}
