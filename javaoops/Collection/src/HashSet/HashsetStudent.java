package HashSet;

import java.util.HashSet;

public class HashsetStudent 
{
	public static void main(String[] args) {
		HashSet<Student> h1 = new HashSet<Student>();
		h1.add(new Student(22,"Aditya"));
		h1.add(new Student(23,"Arnav"));
		h1.add(new Student(25,"Akshay"));
		h1.add(new Student(22,"Aditya"));
		h1.add(new Student(23,"Arnav"));
		
		for(Student s1:h1)
		{
			System.out.println(s1.name+" and age is"+s1.age);
		}
		
	}

}
