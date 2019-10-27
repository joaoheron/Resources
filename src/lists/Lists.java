package lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
	
	// LinkedLists are more performative than Arraylists. When we remove an element from an LinkedList, 
	// the previous index will point to the next index of the removed element
	
	private static void printLinked(LinkedList<String> linkedList) {
		LinkedList<String> citiesToVisit = new LinkedList<String>();
		citiesToVisit.add("Rio");
		citiesToVisit.add("Sao Paulo");
		citiesToVisit.add("Munchen");
		citiesToVisit.add("Dallas");
		citiesToVisit.add("Mexico City");
		citiesToVisit.add("Cape Town");
		citiesToVisit.add("Copenhagen");

		
		Iterator <String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println(("Now at: ") + i.next());
		}
	}
	
}
