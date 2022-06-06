package com.c3;

import java.util.Scanner;

public class Demo {
	String mo;
	void showdetails(Month m) {
		if(m == Month.JAN) {
			System.out.println("This is the !st Monthof the Year January");
			
		}
//		else if(m==m.FEB) {
//			System.out.println("This is the @nd Moonth of Year Feruary");
//			
//		}
//		else if(m==m.MAR) {
//			System.out.println("This is the 3rd month if Year March");
//			
//		}else if(m==m.APR) {
//			System.out.println("This is the 4th Month of YearApril");
//		}else if(m==m.MAY) {
//			System.out.println("This is the 5 the month of Year May");
//		}
//		else if(m==m.JUNE){
//			System.out.println("This is the 6 th month of Year June");
//
//		}
//		else if(m==m.JULY) {
//			System.out.println("This is the 7 th month of Year July");
//		}
//		else if(m==m.AUG) {
//			System.out.println("This is the 8th month of Year August");
//		}
//		else if(m==m.SEP) {
//			System.out.println("This is the 9 th month of Year September");
//		}
//		else if (m==m.OCT) {
//			System.out.println("This is the 10th Month of Year October");
//		}
//		else if(m==m.NOV) {
//			System.out.println("This the 11 the Month odf Year November" );
//		}
//		else if (m==m.DEC) {
//			System.out.println("This is the last month of Year December");
//		}
		}

public static void main(String[] args) {
	
	Demo d=new Demo();
	Scanner s=new Scanner(System.in);
	//String j=s.next()
System.out.println("enter month");
Month m=s.next();
	d.showdetails(m);
	
}
}
