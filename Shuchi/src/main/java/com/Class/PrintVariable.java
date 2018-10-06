package com.Class;

public class PrintVariable {
 
	public static void main(String[] args) {
		//int a = 1584650;
		//System.out.println(a);
		
		int d = 2;
		int c = 2;
		int sum = d+c;
		System.out.println(sum);
		
		//int i;
		//for (i=0;i<=100;i++) {
		
	String country = "United States of America";	
	System.out.println(country);

		for (int b = 2; b <= 100; b++) {
			for (int p = 2; b <= b; p++) {
				if (p == b) {
					System.out.println(b);
				}
				if (b % p == 0) {
					break ;
				}
			}
			
		//printing even and odd number
		
		for (int a= 1; a<= 50; a++) {
			//System.out.println(a);
			if (a%2==0) {
				System.out.println( "this is even:" + a);			
			}
		else {
			System.out.println( "this is odd:" + a);
		}
		
		
}
}
}
}