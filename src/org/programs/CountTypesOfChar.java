package org.programs;

public class CountTypesOfChar {

	public static void main(String[] args) {
		String s = "Loki@134SharMa";
		int upCount=0, loCount=0, numCount=0, specCount =0;
		String up = "",lo ="",num="",spec="";
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (Character.isUpperCase(c)) {
				upCount++;
				up =up+c;
				
			}else if (Character.isLowerCase(c)) {
				loCount++;
				lo =lo+c;
				
			}else if (Character.isDigit(c)) {
				numCount++;
				num =num+c;
		}else
		{
			specCount++;
			spec= spec+c;
		}

	}
		System.out.println("UpperCase is: "+up+",count :"+upCount);
		System.out.println("UpperCase is: "+lo+",count  :"+loCount);
		System.out.println("UpperCase is: "+num+",count :"+numCount);
		System.out.println("UpperCase is: "+spec+",count :"+specCount);
	}
}

