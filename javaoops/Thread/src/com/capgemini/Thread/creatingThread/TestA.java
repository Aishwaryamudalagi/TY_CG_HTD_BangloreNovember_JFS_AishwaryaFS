package com.capgemini.Thread.creatingThread;

public class TestA {
	public static void main(String[] args) {
		System.out.println("Main started.....");
		Thread1 t1= new Thread1();
		t1.start();
		System.out.println("Main ended....");
	}

}
