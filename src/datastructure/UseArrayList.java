package datastructure;
import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> carsName = new ArrayList<>();
		// Add elements
		carsName.add("BMW");
		carsName.add("Audi");
		carsName.add("Bentley");
		carsName.add("Acura");
		carsName.add("Alfa Romeo");
		carsName.add("Aston Martin");
		carsName.add("Dodge");

		// Print all elements
		System.out.println(carsName);

		// Access one element
		System.out.println(carsName.get(5));

		// Add one element
		carsName.add("Jaguar");
		System.out.println("After adding Jaguar" +carsName);

		// Remove element
		carsName.remove("Acura");
		System.out.println("After Remove "+carsName);

		// Print all elements
		System.out.println("************************* using for each loop ****************");
		for(String fruit : carsName){
			System.out.println(carsName);
		}

		System.out.println("************************* using iterator ****************");
		// Print all elements using iterator
		Iterator<String> it = carsName.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		// Sort elements using Collections
		System.out.println("************************* After Sorting ****************");
		Collections.sort(carsName);
		Iterator<String> it2 = carsName.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}




	}

}
