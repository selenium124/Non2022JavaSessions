package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		// <k,v>
		// name = naveen
		// marks = 100
		// seller = seller@gmail.com
		// does not maintain the order

		HashMap<String, String> empMap = new HashMap<String, String>();

		empMap.put("Naveen", "SDET");
		empMap.put("Amrita", "SDET1");
		empMap.put("Rashmi", "SDET2");
		empMap.put("Ravi", "SDET Manager");
		empMap.put("Kareem", "VP");
		empMap.put("Kareem", "CEO");
		empMap.put("Kareem", "CEO");
		empMap.put("Sheela", null);
		empMap.put(null, "CTO");
		empMap.put(null, null);

		System.out.println(empMap.get("Rashmi"));
		System.out.println(empMap.get("Kareem"));
		System.out.println(empMap.get("Tom"));
		System.out.println(empMap.get("Sheela"));
		System.out.println(empMap.get(null));

		System.out.println(empMap);

		HashMap<String, Integer> browserMap = new HashMap<String, Integer>();

		browserMap.put("chrome", 100);
		browserMap.put("firefox", 90);
		browserMap.put("ie", 7);
		browserMap.put("safari", 10);
		browserMap.put("safari", 100);

		System.out.println(browserMap);

		System.out.println(browserMap.get("safari"));

		
		String s = "123";
		String rev = "";
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+ s.charAt(i);
		}
		System.out.println(rev);

		
		int number = 989776;
		int reverse = 0;
		while (number != 0) {
			int remainder = number % 10;//123 % 10 = 3
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}

		System.out.println(reverse);

	}

}
