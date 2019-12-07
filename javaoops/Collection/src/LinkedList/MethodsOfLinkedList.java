package LinkedList;

import java.util.LinkedList;

public class MethodsOfLinkedList 
{
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
			l1.add(12);
			l1.add(13);
			System.out.println(l1);
			l1.addFirst(45);
			System.out.println(l1);
			l1.addLast(89);
			System.out.println(l1);
			System.out.println("-----REMOVE------");
			l1.remove();
			System.out.println(l1);
			System.out.println("-----REMOVEFIRST AND REMOVELAST----");
			l1.removeFirst();
			l1.removeLast();
			System.out.println(l1);
			
			
		LinkedList l2=new LinkedList();	
		l2.add(45);
		l2.add(89);
		l2.add(33);
		l2.add(56);
		l2.add(89);
		l2.add(79);
		System.out.println(l2);
		System.out.println(("-----REMOVEFIRSTOCCURANCE--------"));
		l2.removeFirstOccurrence(89);
		System.out.println(l2);
		System.out.println(("-----REMOVELASTOCCURANCE--------"));
		l2.removeLastOccurrence(89);
		System.out.println(l2);
		
		System.out.println("----GETFIRST AND GETLAST-------");
		System.out.println(l2.getFirst());
		System.out.println(l2.getLast());
		
		LinkedList l3=new LinkedList();
		l3.add(90);
		l3.add(56);
		l3.add(72);
		l3.add(87);
		System.out.println(("PEEK AND PEEKFIRST AND PEEKLAST"));
		System.out.println(l3.peek());
		System.out.println(l3.peekFirst());
		System.out.println(l3.peekLast());
		System.out.println(l3);
		System.out.println(("POLL AND POLLFIRST AND POLLLAST"));
		System.out.println(l3.poll());
		System.out.println(l3.pollFirst());
		System.out.println(l3.pollLast());
		System.out.println(l3);
		System.out.println(("OFFER AND OFFERFIRST AND OFFERLAST"));
		l3.offer(33);
		System.out.println(l3);
		l3.offerFirst(44);
		System.out.println(l3);
		l3.offerLast(55);
		System.out.println(l3);
		
		LinkedList l4 = new LinkedList();
		l4.add(67);
		l4.add(87);
		l4.add(99);
		l4.add(71);
		System.out.println("----PUSH-----");
		l4.push(59);
		System.out.println(l4);
		System.out.println("----POP-----");
		l4.pop();
		System.out.println(l4);
		System.out.println("----ELEMNT----");
		System.out.println(l4.element());
		System.out.println(l4);
			
		
		
		
		
		
		
		
			
			
			
			
		
	}

}
