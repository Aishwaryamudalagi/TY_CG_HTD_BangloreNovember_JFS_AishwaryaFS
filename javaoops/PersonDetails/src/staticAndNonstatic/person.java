package staticAndNonstatic;

public class person 
{
	static int age;
	String name;
	void personDetails()
	{
		System.out.println("name of person is" +name + " Age of person is"+age);
		personDetailsStatic();
	}
	static void personDetailsStatic() 
	{
		System.out.println("age:"+age);	
	}
}
