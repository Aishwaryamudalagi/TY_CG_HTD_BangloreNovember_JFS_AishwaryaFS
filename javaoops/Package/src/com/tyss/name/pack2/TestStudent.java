package com.tyss.name.pack2;

import com.tyss.name.pack1.Student;

public class TestStudent extends Student
{

	protected TestStudent(String name) {
		super(name);
		
	}
	void details()
	{
		System.out.println("my name is:"+studName);
	}
	public static void main(String[] args) {
		TestStudent s1=new TestStudent("abc");
		s1.studDetails();
		
	}
	

}
