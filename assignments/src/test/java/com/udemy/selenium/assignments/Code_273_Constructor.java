package com.udemy.selenium.assignments;

public class Code_273_Constructor {


	// Default 
	public Code_273_Constructor() { 
		System.out.println(" I am in the constructor"); 
		System.out.println(" I am in the constructor lecture 1"); //  
		} // Parameterized constructor 
	public Code_273_Constructor(int a, int b) { 
		System.out.println(" I am in the parameterized constructor"); 
		int c=a+b; System.out.println(c);
		} 
	public Code_273_Constructor(String str) {
		System.out.println(str); 
		} public void getdata() {
			System.out.println("I am the method");
			} 
		//will not return values //name of constructor should be the class name
	


public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	Code_273_Constructor cd= new Code_273_Constructor(); 
	Code_273_Constructor cds= new Code_273_Constructor("hello");
	Code_273_Constructor c= new Code_273_Constructor(4,5); 
	// compiler will call implict constructor if you have not defined constructor block
	//when ever you create an object constructor is called 
	//block of code when ever an object is created 
	}

}