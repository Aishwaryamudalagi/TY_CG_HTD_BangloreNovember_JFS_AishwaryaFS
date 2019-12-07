
public class Immutable 
{
	private int age;
	private String name;
	public Immutable(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	 int getAge()
	{
		return this.age;
	}
	 String getName()
	{
		return this.name;
	}

}
