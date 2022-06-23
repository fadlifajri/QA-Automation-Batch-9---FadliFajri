package tugas01;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TugasPertama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> fruitStock = new TreeMap<>();
		
		fruitStock.put("Apple", 25);
		fruitStock.put("Orange", 500);
		fruitStock.put("Grape", 150);
		fruitStock.put("Melon", 30);
		fruitStock.put("Mango", 650);
		
		for(Map.Entry<String, Integer> currentStock: fruitStock.entrySet()) {
			System.out.println("There are " + currentStock.getValue() + " " + currentStock.getKey() + " left.");
		}
		
		TreeSet<String> vegetables = new TreeSet<>();
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Cabbage");
		vegetables.add("Leek");
		vegetables.add("Scallion");
				
		for(String item: vegetables) {
			System.out.println(item);
		}
		
		
		
		
		
	}

}
