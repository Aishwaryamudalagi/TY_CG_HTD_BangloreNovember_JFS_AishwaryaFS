package LooseCoupling;

public class TestPerson {
	public static void main(String[] args) {
		Bank b1= new Bank();
		Person p1=new Person();
		Sbi s1= new Sbi();
		Hdfc h1=new Hdfc();
		Canara c1=new Canara();
		
		p1.chooseBank(c1);
		
	}

}
