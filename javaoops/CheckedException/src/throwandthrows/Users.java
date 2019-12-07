package throwandthrows;

public class Users
{
	public static void main(String[] args) {
		System.out.println("Main started...");
		IRCTC i1=new IRCTC();
		Paytm p1= new Paytm(i1);
		p1.bookTicket();
		System.out.println("Main ended...");
	}

}
