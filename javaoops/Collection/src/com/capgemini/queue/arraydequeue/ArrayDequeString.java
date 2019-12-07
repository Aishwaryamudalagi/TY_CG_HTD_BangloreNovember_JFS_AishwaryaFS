package com.capgemini.queue.arraydequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeString 
{
	public static void main(String[] args) {
		ArrayDeque<String> a1 = new ArrayDeque<String>();
		a1.add("asd");
		a1.add("zxc");
		a1.add("wer");
		a1.add("asd");
		Iterator<String> itr=a1.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
	}
}
