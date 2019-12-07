package Comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
	int age;
	double sal;
	String name;
	public Employee(int age, double sal, String name) {
		super();
		this.age = age;
		this.sal = sal;
		this.name = name;
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
