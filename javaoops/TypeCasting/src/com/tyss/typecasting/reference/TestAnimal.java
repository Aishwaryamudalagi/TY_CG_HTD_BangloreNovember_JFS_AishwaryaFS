package com.tyss.typecasting.reference;

public class TestAnimal 
{
	public static void main(String[] args) {
		Animal a1= new Animal();
		a1.eat();
		Animal a2= new Lion();
		a2.eat();
		Lion l1= (Lion) a2;
		l1.eat();
		l1.hunt();
		Animal a3=new Lioness();
		a3.eat();
		Lioness l2=(Lioness) a3;
		l2.sleep();
		l2.eat();
		
	}

}
