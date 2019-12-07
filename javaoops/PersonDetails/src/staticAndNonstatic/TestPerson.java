package staticAndNonstatic;

public class TestPerson 
{
	public static void main(String args[])
	{
		person p1 = new person();
		person.age =23;
		p1.name="John";
		p1.personDetails();
	}

}
