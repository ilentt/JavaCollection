package ilentt.ilenlab.com.javacollection;

import java.util.HashMap;

public class HashMapDemo {

	public HashMapDemo() {
		// constructor
	}
	
	public void HasdMap() {
		HashMap<String,Float> salary = new HashMap<String,Float>();
		salary.put("E001", 700f);
		salary.put("E002", 652f);
		salary.put("E003", 845f);
		salary.put("E004", 548f);
		
		Float e002 = salary.get("E002");
		System.out.println("Salary of employee E002: " + e002);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo h = new HashMapDemo();
		h.HasdMap();
	}

}
