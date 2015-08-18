package ilentt.ilenlab.com.javacollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

public class CollectionIterator {
	
	public CollectionIterator() {
		// constructor
	}
	
	public void IteratorCollect() {
		Collection<String> c = new Vector<String>();
		c.add("Queue");
		c.add("List");
		c.add("Set");
		
		System.out.println("Size of collection: "+c.size());
		
		Iterator<String> i = c.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println("Element: "+s);
		}
	}
	
	public void IteratorList() {
		List<String> l = new ArrayList<String>();
		l.add("List 1");
		l.add("List 2");
		l.add("List 3");
		
		System.out.println("Size of list: "+l.size());
		
		//Iterator<String> i = l.iterator();
		ListIterator<String> i = l.listIterator();
		
		System.out.println("First element: " +i.next());
		System.out.println("Second element: " +i.next());
		if(i.hasPrevious())
			System.out.println("Previous element: " +i.previous());
		
		System.out.println("\n");
		
		while(i.hasNext()) {
			String s = i.next();
			System.out.println("Element: "+s);
		}
	}
	
	public void IteratorSet() {
		Set<String> set = new HashSet<String>();
		for(int i = 0; i<10; i++)
			set.add("Set "+i);
		//set.add("Set 1");
		
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println("Element set: "+s);
		}
	}
	
	public void QueueCollection() {
		Queue<String> q = new LinkedList<String>();
		for(int i=0; i<10; i++)
			q.offer("Element "+i);
		boolean flag = false;
		if(q.size()>0)
			flag = true;
		while(flag) {
			System.out.println("Member in queue: " + q.poll());
			if(q.size()==0)
				flag = false;
		}
	}
	
	public void PriorityQueueCollection() {
		Queue<String> q = new PriorityQueue<String>();
		q.offer("U");
		q.offer("K");
		q.offer("M");
		
		boolean flag = false;
		if(q.size()>0)
			flag = true;
		while(flag) {
			System.out.println("Member in priority queue: " + q.poll());
			if(q.size()==0)
				flag = false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionIterator c = new CollectionIterator();
		//c.IteratorCollect();
		//c.IteratorList();
		//c.IteratorSet();
		//c.QueueCollection();
		c.PriorityQueueCollection();
	}

}
