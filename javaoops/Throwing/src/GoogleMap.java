
public class GoogleMap 
{
	void findLocation(String loc)
	{
		try 
		{
			System.out.println(loc.length());
		}
		catch(NullPointerException n)
		{
			System.out.println("GoogleMap uder please fill the location name");
			throw n;
		}
		
	}

}
