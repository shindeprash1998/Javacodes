package viva;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		 
		TreeSet<String> t=new TreeSet<>();
		t.add("deepak");
		t.add("Jyoti");
		t.add("Sadhana");
		
		System.out.println(t);
		
		for(String s : t)
		{
			System.out.println(s);
		}
		

	}

}
