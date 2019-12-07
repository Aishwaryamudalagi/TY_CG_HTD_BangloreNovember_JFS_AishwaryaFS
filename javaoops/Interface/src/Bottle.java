
interface Bottle
{
	int cost=40;
	void open();
	void drink();
	default void juice()
	{
		System.out.println("Bottle has juice in it");
	}
	static void close()
	{
		System.out.println("close the bottle");
	}
	
	

}
