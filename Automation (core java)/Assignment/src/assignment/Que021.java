package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Que021 {
public static void main(String[] args) {
	// Que21 WAP to iterate through all elements in an array list. 
	
	List list = new ArrayList();
	list.add(01);
	list.add("java");
	list.add(12345);
	list.add(3.14);
	list.add(false);
	list.add(98989989);
	
	System.out.println(list);
	list.add(012);
	System.out.println(list);
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
	
}
}
