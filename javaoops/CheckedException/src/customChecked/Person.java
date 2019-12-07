package customChecked;

public class Person 
{
	public static void main(String[] args) {
		System.out.println("Election started....");
		Election e1=new Election();
		try
		{
			e1.vote(15);
		}
		catch(AgeLimitException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Election ended...");
	}

}
