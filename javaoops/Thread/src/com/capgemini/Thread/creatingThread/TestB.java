package com.capgemini.Thread.creatingThread;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main started...");
		Thread2 t1 = new Thread2();
		Thread t = new Thread(t1);
		t.start();
		System.out.println("Main ended...");
	}

}
