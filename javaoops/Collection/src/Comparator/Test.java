package Comparator;


import java.util.TreeSet;

public class Test 
{
	public static void main(String[] args) {
		EmpAge e1 =new EmpAge();
		EmpName e2 = new EmpName();
		EmpSal e3 = new EmpSal();
		TreeSet<Employee>t1 = new TreeSet<Employee>(e3);
		t1.add(new Employee(28,25000,"Abhram"));
		t1.add(new Employee(25,32000,"xavier"));
		t1.add(new Employee(32,47000,"Ram"));
		for(Employee e : t1)
		{
			System.out.println("name is"+e.name);
			System.out.println("age is"+e.age);
			System.out.println("sal is"+e.sal);
		}
	}
				
	

}
