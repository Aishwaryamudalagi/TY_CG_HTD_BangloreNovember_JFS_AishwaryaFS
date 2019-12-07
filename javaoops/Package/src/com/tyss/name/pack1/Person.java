package com.tyss.name.pack1;

public class Person 
{
	public  String name;
	public static int age;
	public Person(String name)
	{
		this.name=name;
		
	}
	public void details()
	{
		System.out.println("name of the person is:"+name);
	}
	public static void personDetails()
	{
		System.out.println("age of the person is:"+age);
	}
	

}
