package com.velocity.mock;

import java.util.Scanner;

public class Example {
	
	
	public static void largestNumber() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first Number- ");
		int a=scanner.nextInt();
		System.out.println("Enter second Number- ");
		int b=scanner.nextInt();
		System.out.println("Enter third Number- ");
		int c=scanner.nextInt();
		
		if (a>b&&a>c) {
			System.out.println(a+" Is the largest Number ");
		}else if(b>a&&b>c) {
			System.out.println(b+" Is the largest Number ");
		}else{
			System.out.println(c+" Is the largest Number ");
		}
		
		
		
	}

	public static void main(String[] args) {
		
		largestNumber();
		int a[]= {1,3,4,7,5,6};
		int large=0;
		for (int i=0; i<a.length;i++) {
			if (large<a[i]) {
				large=a[i];
			}		
		}
		System.out.println(large);
		int b[]= {1,3,4,7,5,6};
		int small=b[0];
		for (int i=0; i<a.length;i++) {
			if (small>a[i]) {
				small=a[i];
			}		
		}
		System.out.println(small);
		
		
	}

}
