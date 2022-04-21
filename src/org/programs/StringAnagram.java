package org.programs;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1 = "keep";
		String s2 = "peek";
		 
		char[] cS1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray(); 
		
		Arrays.sort(cS1);
//		System.out.println(cS1);
		Arrays.sort(cs2);
//		System.out.println(cs2);
		
		if(Arrays.equals(cS1,cs2)) {
			System.out.println("anagram");
		}
		else{
			System.out.println("not anagram");
		}		
		}
	}

