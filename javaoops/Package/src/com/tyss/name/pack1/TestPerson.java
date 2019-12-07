package com.tyss.name.pack1;

public class TestPerson {
public static void main(String[] args) {
	Person p1=new Person("Abhay");
	System.out.println(p1.name);
	p1.details();
	System.out.println(Person.age);
	Person.personDetails();
}
}
