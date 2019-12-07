
public class TestA 
{
	public static void main(String[] args) {
		System.out.println("Main started..");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dont deal with zero");
		}
		finally
		{
			System.out.println("Finally blockk is called");
		}
		System.out.println("Main ended...");
	}

}
