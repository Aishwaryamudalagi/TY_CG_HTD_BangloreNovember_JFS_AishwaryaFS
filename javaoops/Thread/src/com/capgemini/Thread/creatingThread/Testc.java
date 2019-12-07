package com.capgemini.Thread.creatingThread;

public class Testc {
	public static void main(String[] args) {
		System.out.println("Main started...");
		PVR p1= new PVR();
		User u1=new User(p1);
		u1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p1.leaveMe();
		System.out.println("Main ended...");
	}

}
