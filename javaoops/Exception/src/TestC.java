
public class TestC 
{
	public static void main(String[] args) {
		System.out.println("Main started");
		int[] a1=new int[3];
		try {
		a1[0]=10;
		a1[1]=20;
		a1[2]=30;
		a1[3]=40;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("There is insufficient memory to store the data");
		}
		System.out.println("Main Ended...");
	}

}
