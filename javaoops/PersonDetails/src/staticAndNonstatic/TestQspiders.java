package staticAndNonstatic;

public class TestQspiders 
{
	public static void main(String[] args) 
	{
		Qspiders BTR = new Qspiders();
		BTR.swipe();
		BTR.swipe();
		Qspiders BTM = new Qspiders();
		BTM.swipe();
		System.out.println(BTR.branchCount);
		System.out.println(BTM.branchCount);
		System.out.println(Qspiders.totalCount);
		
		
		
	}

}
