package viva;

 

class DemoRemovealbhatesaddrestnumber
{
	 public static void main(String[] args) 
	 {
		 String str="S1A2G3A4R10";
		 int sum=0;
		 String numbers=str.replaceAll("[A-Za-z]"," ");
		 
		 String arr[]=numbers.trim().split("\\s+");
		 
		 for(String num :arr)
		 {
			 sum+=Integer.parseInt(num);
		 }
		 System.out.println("sum of rest numbers:"+sum);
		 
		 
		
	}
	   
		
		 

}
	
	

