
public class Person 
{
	private String name;
    Person(String name)
	{
		this.name=name;
	}
	private void display()
	{
		System.out.println("name of the person is:" +name);
	}
	public static void main(String[] args) {
		Person p1=new Person("Aishwarya");
		p1.display();
		
	}

}
