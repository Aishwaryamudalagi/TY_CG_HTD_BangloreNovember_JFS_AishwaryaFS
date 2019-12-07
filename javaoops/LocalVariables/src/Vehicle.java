
public class Vehicle 
{
	int cost=60000;

}
class Car extends Vehicle
{
	int cost =450000;
	void carDetails()
	{
		int cost=30000;
		System.out.println("cost of car is"+super.cost);
		System.out.println("cost of car is"+this.cost);
		System.out.println("cost of car is"+cost);
	}
}



