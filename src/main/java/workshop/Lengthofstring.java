package workshop;

import org.junit.matchers.Each;

public class Lengthofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "TESTLEAF";
		
		System.out.println("The lenght of the given string TESTLEAF is :"  + name.length());
		
		System.out.println("The lenght of the given string TESTLEAF is :"  + name.charAt(7));
		
		
//		for (String name1 : name.length()) {
//			
//		}
		
		
		StringBuilder name1 = new StringBuilder(name);
		
		System.out.println("The lenght of the given string TESTLEAF is :"  + name1.reverse());
		
			
		
		char array[]  = {'T','E','S','T','L','E','A','F'};
		
		String reverse="";
		
		for (int i=array.length-1;i>=0;i--)
		{
					
			reverse = reverse+(array[i]);
						
		}
		System.out.println("The number of E occurence is :" +reverse);
		
		
		
		
		
		
	}

}
