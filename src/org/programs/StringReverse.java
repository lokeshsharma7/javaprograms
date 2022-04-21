package org.programs;
import java.time.format.ResolverStyle;

public class StringReverse {
	public static void main(String[] args) {
		String name = "Lokesh";
		String rev = "";
		int count = 0;
		
		for (int i = name.length()-1; i >=0; i--) {
		 char c = name.charAt(i);
		      rev  = rev+c;	
		      count++;
		}
		System.out.println("Reverse of "+name+" is  "+rev);
		System.out.println("Total letters in string "+name+" is "+count);
		
	}

}
