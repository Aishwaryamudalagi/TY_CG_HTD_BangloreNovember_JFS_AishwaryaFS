package com.capgemini.Thread.creatingThread;

public class IRCTC {
	synchronized void confirmTicket() {
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
		
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}
	}
	synchronized void leaveMe()
	{
		System.out.println("Notify called");
		notify();
	}

}
