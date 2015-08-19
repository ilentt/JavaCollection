package ilentt.ilenlab.com.javacollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicatedList {
	private List<String> dupList;
	
	public DuplicatedList() {
		// constructor
		this.dupList = (List<String>)Arrays.asList("Java","Android","mySQL","Java");
	}
	public void RemoveDuplicatedItem() {
		System.out.println("Size of duplicated list: " + this.dupList.size());
		System.out.println("Element list: " +this.dupList.toString());
		
		HashSet<String> listToSet = new HashSet<String>(this.dupList);
		List<String> listWithOutDuplicated = new ArrayList<String>(listToSet);
		
		System.out.println("\nSize of duplicated list after remove duplicate element: " + listWithOutDuplicated.size());
		System.out.println("Element list: " +listWithOutDuplicated.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicatedList d = new DuplicatedList();
		d.RemoveDuplicatedItem();
	}

}
