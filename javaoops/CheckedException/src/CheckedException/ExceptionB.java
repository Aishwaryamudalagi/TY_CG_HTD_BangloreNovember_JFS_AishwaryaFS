package CheckedException;

public class ExceptionB 
{
	public static void main(String[] args) {
		System.out.println("Main started");
		Student s1=new Student();
		try
		{
			Object o1=s1.clone();
			System.out.println("Object is cloned");
			Class c1=Class.forName("CheckedException.Student");
			System.out.println("Class is found");
		}
		catch(CloneNotSupportedException e)
		{
			System.out.println("Clone not supported");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("class is not found");
		}
		System.out.println("Main ended...");
	}

}
