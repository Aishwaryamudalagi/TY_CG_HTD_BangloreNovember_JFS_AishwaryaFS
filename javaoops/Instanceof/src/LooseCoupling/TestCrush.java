package LooseCoupling;

public class TestCrush 
{
	public static void main(String[] args) {
		Crush c1= new Crush();
		
		BasicSet b1= new BasicSet();
		Oppo o1= new Oppo();
		OnePlus p1= new OnePlus();
		Apple a1= new Apple();
		
		c1.receive(a1);
	}

}
