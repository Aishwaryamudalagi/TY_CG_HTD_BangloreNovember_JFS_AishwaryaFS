package com.capgemini.maps.Tree;

public class Student implements Comparable<Student> 
{
	int age;
	String name;
	public Student(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public int compareTo(Student o) {
		if(this.age>o.age)
		{
			return 1;
		}
		else if(this.age<o.age)
		{
			return -1;
		}
		else
		{
		return 0;
		}
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	 

}
