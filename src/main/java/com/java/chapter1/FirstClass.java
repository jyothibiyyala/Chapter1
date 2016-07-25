package com.java.chapter1;
/*This is my fiest java programme
 * to print sum of two numbers.
 * Author:jyothi
 * Project Name:Chapter1
 * Version:1.0
*/
public class FirstClass {

	public int a;//declae a var to assign some val
	public int b;
	
	
	public void sum(int a,int b ) {//Here int a and int b are the method parameters
		
		System.out.println("sum of a+b = " + (a+b));
	   
		}
	
	
	public static void main(String[] args) {
		FirstClass firstobj=new FirstClass();//Here am creating an object to call "sum" method in FirstClass 
		firstobj.sum(2,4);//Here am calling a method "sum"
		
	}
	
	
}
