package com.c3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Number {
	
	 static int x;
	// int i;
	

	
public static void main(String[] args) {
	Number n=new Number();
	
	try {
	Scanner s=new Scanner(System.in);
	
	System.out.println("enter size");
	
	n.x=s.nextInt();
	//System.out.println(n.x);
	int[] arr=new int[x];
System.out.println("enter value");
for(int i=0;i<n.x;i++) {
	arr[i]=s.nextInt();
	//System.out.println(arr[i]);
	arr[i]=s.nextInt();
	 //close();
	 break;
}
System.out.println("enter index");
  
  
  
	  int i=s.nextInt();
	  //int i=s.nextInt();
	  System.out.println(arr[i]);
  
 // int i=s.nextInt();


	}
	catch(ArrayIndexOutOfBoundsException a ){
		System.out.println("enter valid index");
	}
catch(NumberFormatException s) {
	System.out.println("java.lang.NumberFormatException");
}
	catch(InputMismatchException l) {
		System.out.println("input mismatch");
		
	}

	
}



private static void close() {
	// TODO Auto-generated method stub
	
}
}
