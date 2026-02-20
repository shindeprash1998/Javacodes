package viva;

public class Demo5 
{
	public static void main(String[] args) 
	{
		int n=4;
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
				System.out.println("yes palindrome");
			}
			else
			{
				System.out.println("not a palindrome");
			}
		}
		else
		{
			System.out.println("not a prime");
		}
	  	 
	}

}
