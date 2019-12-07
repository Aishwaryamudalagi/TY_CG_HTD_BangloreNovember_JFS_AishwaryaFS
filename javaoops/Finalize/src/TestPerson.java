
public class TestPerson extends Person {
public TestPerson(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws Throwable {
	System.out.println("main method started");
	Person p1=new Person("ABC");
	TestPerson p2=new TestPerson("XYZ");
	p2.finalize();
	p1=null;
	System.gc();
	System.out.println("main ended");
}
}
