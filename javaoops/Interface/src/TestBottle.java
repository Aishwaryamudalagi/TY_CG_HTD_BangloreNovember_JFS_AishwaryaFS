
public class TestBottle 
{
	public static void main(String[] args) {
		peps p1=new peps();
		p1.open();
		p1.drink();
		p1.juice();
		System.out.println(peps.cost);
		Bottle.close();
		
		Fanta f1=new Fanta();
		f1.open();
		f1.drink();
	}

}
