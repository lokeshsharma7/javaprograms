package org.programs;

public class SwappingStrings {

	public static void main(String[] args) {
		String s1 = "lokesh";
		String s2 = "bala";
		
//		String temp = s1;
//		s1= s2;
//		s2=temp;
//		System.out.println(s1);
//		System.out.println(s2);
		
		s1 = s1+s2;
		System.out.println(s1);
		s2= s1.substring(0,(s1.length()-s2.length()));
		System.out.println("after swaping s2: "+s2);
		s1 = s1.substring(s2.length());
		System.out.println("after swaping s1: "+s1);
		
			
		}
		
		
		
		
	}

//}
