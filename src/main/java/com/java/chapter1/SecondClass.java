package com.java.chapter1;

public class SecondClass {
	
	public void method(int a,int b) {
	
		int c=a+b;
	     
		System.out.print("sum of two numbers = " + c);
		
	}
public static void main(String[] args){
	SecondClass object=new SecondClass();
	
	object.method(2,3);
	
}

}
