package viva;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;

public class Duplicates 
{
	public static void main(String[] args) 
	{
		int n=5;
		int count=0;
		
		if(n>1)
		{
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
					count++;
			}
			if(count==2)
			{
				System.out.println("yes prime");
			}
			else
			{
				System.out.println("no");
			}
			
		}
		else
		{
			System.out.println("Not a prime");
		}
		
		
	}
	

}
