package seleniumPractice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Countchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Getting input from user
		System.out.println("Enter the String to test");
		Scanner sc = new Scanner(System.in);
		String rawString = sc.nextLine().toLowerCase().replace(" ", "");
		sc.close();
		
		// Print the raw string
		System.out.println("The raw string is: " + rawString);
		
		// Converting String to char array
		char[] charArray = rawString.toCharArray(); 
	
		// Creating a Tree map
		Map<Character, Integer> charMap = new TreeMap<Character, Integer>();
		
		// Adding the values to the Map
		for (char c : charArray) {
		charMap.put(c, charMap.get(c) == null ? 1 : charMap.get(c) + 1);
		}
		
		for (Character key : charMap.keySet()) {
			System.out.println("Occurence of: " + key + " Times:" + charMap.get(key));
		}
		

	}

}