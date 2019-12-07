
public class DayLimitException extends RuntimeException
{
	String msg="exceeds day limit";
	DayLimitException()
	{
		
	}
	DayLimitException(String m)
	{
		this.msg=m;
	}
	public String getMessage()
	{
		return this.msg;
	}

}
