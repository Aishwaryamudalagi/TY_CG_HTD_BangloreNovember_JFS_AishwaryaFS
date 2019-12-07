package com.capgemini.queue.priorityqueue;

public class Student implements Comparable<Student> 
{
	int age;
	String Name;
	public Student(int age, String name) {
		super();
		this.age = age;
		Name = name;
	}
	@Override
	public int compareTo(Student o) {
		
		return 1;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", Name=" + Name + "]";
	}

}
