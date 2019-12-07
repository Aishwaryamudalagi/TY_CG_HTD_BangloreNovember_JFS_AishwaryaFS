package overloading;

public class Calculator 
{
	int add(int a)
	{
		return a+a;
	}
	int add(int a, int b)
	{
		return a+b;
	}
	double add(double a)
	{
		
		return a+a;
	}
	static int multiply(int a)
	{
		System.out.println("multiplication is"+(a*a));
		return a*a;
	}
	static void multiply(double a,double b)
	{
		System.out.println("multiplication of 2 numbers is:"+(a*b));
	}

}
