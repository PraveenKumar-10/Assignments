package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Praveen");
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentId() {
		System.out.println("1111");
	}
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();

	}

}
