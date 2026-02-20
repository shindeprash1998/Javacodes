package viva;

import java.util.HashSet;
import java.util.Set;

public class Duplicatesremoval 
{
	public static void main(String[] args) 
	{
		 
	 int[] arr= {34,56,45,34,56,78,90};
	 
	 Set<Integer> seen=new HashSet<>();
	 for(int num : arr)
	 {
		 seen.add(num);
	 }

}
}