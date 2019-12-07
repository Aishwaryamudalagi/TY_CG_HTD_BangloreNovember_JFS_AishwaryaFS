package TreeSet;

import java.util.TreeSet;

public class TreeSetStudent 
{
	public static void main(String[] args) {
		TreeSet<Student> t1 = new TreeSet<Student>();
		t1.add(new Student(45,"John"));
		t1.add(new Student(41,"Mickey"));
		t1.add(new Student(47,"Sandy"));
		
		for(Student student:t1)
		{
			System.out.println("Student name is "+student.name);
			System.out.println("Student name is "+student.marks);
		}
	}

}
