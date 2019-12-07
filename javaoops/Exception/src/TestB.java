
public class TestB
{
	void write()
	
	{
		String s1=null;
		try
		{
		System.out.println("Length id:"+s1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("Dont deal with null pointers");
		}

	}
}


