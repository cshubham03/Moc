package com.velocity.mock;


public class Employee {
	
	public static void main(String[] args) {
		
		int a[]= {1,2,4,5,6,9};
		for (int i=1;i<a.length;i=i+2) {
			System.out.println(a[i]);
		}
		
		
		String s1="triangle";
		String s2="integral";
		String r="";
		if (s1.length()==s2.length()) {
			
			for (int i=0;i<s1.length();i++) {
				for(int j=0;j<s2.length();j++) {
					if (s1.charAt(i)==s2.charAt(j)) {
						r=s2.charAt(j)+r;
						break;
					}
				}
			}
			System.out.println(r);
			if(s1.equals(r))
				System.out.println("This is an Anagram...");
			else 
				System.out.println("This is not an Anagram...");
			
		}else {
			System.out.println("This is not Anagram...");
		}
		
	}
}
