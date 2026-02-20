package viva;
/*
 * duplicate,reverse 2 ways,anagram, palindrome number,prime number
 */

public class Removecharandadditionofnumber 
{
	 public static void main(String[] args) 
	 {
		String input="a2b2c6d10";
		String[] output=input.split("[A-Za-z]");
		int sum=0;
		for(int i=0;i<output.length;i++)
		
		{
			if(!output[i].isEmpty())
			{
				sum=sum+Integer.parseInt(output[i]);
			}
			System.out.println(output[i]+" ");
		}
		System.out.println("sum of numbers are:"+sum);
		
		System.out.println(output);
          
	}
	
	}
	 


