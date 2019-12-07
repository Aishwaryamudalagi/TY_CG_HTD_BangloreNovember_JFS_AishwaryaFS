
public class Test 
{
	public static void main(String[] args) {
		System.out.println("Main started");
		ExceptionA e1=new ExceptionA();
		e1.exception(2, null);
		e1.exception(0,"Ramu");
		System.out.println("Main ended");
	}

}
