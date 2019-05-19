package lists;

import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
	
	// Arraylist
	
	// LinkedList
	// Mais perfomartico, para remover um item da lista ele faz o item anterior apontar para o item seguinte, etc
	private static void printLinked(LinkedList<String> linkedList) {
		LinkedList<String> placesToVisit = new LinkedList<String>();
		placesToVisit.add("Somalia");
		placesToVisit.add("Marrocos");
		placesToVisit.add("Berlim");
		placesToVisit.add("Polonia");
		placesToVisit.add("Camboja");
		placesToVisit.add("Africa do Sul");
		placesToVisit.add("Dinamarca");

		
		Iterator <String> i = linkedList.iterator();
		while (i.hasNext()) {
			System.out.println(("Now at: ") + i.next());
		}
	}
	
}
