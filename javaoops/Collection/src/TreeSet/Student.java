package TreeSet;

public class Student implements Comparable<Student>
{
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	//@Override
	/*public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.marks>o.marks)
		{
			return 1;
		}
		else if(this.marks<o.marks)
		{
			return -1;
		}
		else 
		{
		return 0;
		}
	}
	*/
	@Override
	public int compareTo(Student o) {
		
		return this.name.compareTo(o.name);
	}

}
