
public class SBIAtm 
{
	public static void main(String[] args) {
		System.out.println("main started...");
		ATMSimulator s1=new ATMSimulator();
		try
		{
			s1.withdraw(41000);
		}
		catch(DayLimitException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main ended....");
	}

}
