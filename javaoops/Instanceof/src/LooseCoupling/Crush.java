package LooseCoupling;

public class Crush 
{
	void receive(Phone p)
	{
		if(p instanceof BasicSet)
		{
			System.out.println("Thanks");
		}
		else if(p instanceof Oppo)
		{
			System.out.println("Thank u");
		}
		else if(p instanceof OnePlus)
		{
			System.out.println("Thank u so much");
		}
		else if(p instanceof Apple)
		{
			System.out.println("Love u");
		}
		else 
		{
			System.out.println("Idiot");
		}
	}

}
