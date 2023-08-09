package org.department;


import org.college.College;

public class Department extends College{

	public void deptName() {
		System.out.println("ECE");
	}
	
	public static void main(String[] args) {
		Department obj = new Department();
		obj.deptName();
		

	}

}
