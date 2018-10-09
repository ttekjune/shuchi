package com.Class;

public class Oct3 {

	int a = 10;
	static int b = 30;
	
	static void getPerson () {
		// System.out.println(a); // this is an error because it needs to be a static variable
		System.out.println(b);
	}
	
	void getLogIn () {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
		Oct3 obj = new Oct3();
		obj.getLogIn();
		
		
		
		
		
		
	}

}
