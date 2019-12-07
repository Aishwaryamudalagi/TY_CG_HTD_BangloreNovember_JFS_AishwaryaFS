package com.tyss.name.pack2;

import com.tyss.name.pack1.Person;
import static com.tyss.name.pack1.Person.*;


public class TestPerson 
{
	public static void main(String[] args) {
		System.out.println("age"+age);
		Person p1=new Person("Jhanvi");
		System.out.println(p1.name);
		p1.details();
		personDetails();
	}

}
