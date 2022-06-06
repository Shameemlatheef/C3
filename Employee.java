package com.c3;

public abstract class Employee {
	int employeid;
 String employeeName;
 double salary;
public Employee(int employeid, String employeeName) {
	super();
	this.employeid = employeid;
	this.employeeName = employeeName;
}
abstract void  calculateSalary(); 
 

}
