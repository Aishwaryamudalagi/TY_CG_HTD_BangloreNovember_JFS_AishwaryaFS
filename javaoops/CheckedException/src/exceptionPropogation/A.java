package exceptionPropogation;

public class A 
{
	public static void main(String[] args) {
		System.out.println("Main started...");
		try
		{
			B.m();
		}
		catch(ClassNotFoundException c)
		{
			System.out.println("Ecxeption is not handled in A class also");
		}
		System.out.println("Main ended...");
	}

}
