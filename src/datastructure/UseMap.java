package datastructure;
import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, String> cars = new HashMap<>();

		List<String> toyotaCars = new ArrayList<>();
		toyotaCars.add("rav4");
		toyotaCars.add("camry");
		toyotaCars.add("corolla");

		List<String> BMWCars = new ArrayList<>();
		BMWCars.add("I720");
		BMWCars.add("I300");
		BMWCars.add("M3");

		Map<String,List<String>> map = new LinkedHashMap<>();
		map.put("toyota", toyotaCars);
		map.put("BMW", BMWCars);
		for (int i = 0; i< map.size(); i++){

		}
		System.out.println(map.size());
		System.out.println(map);
	}

}
