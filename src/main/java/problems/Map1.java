package problems;

import java.util.Map;

public class Map1 {
	// url :: https://codingbat.com/java/Map-1

	// url :: https://codingbat.com/prob/p197888
	/*
	 * Statement :: Modify and return the given map as follows: if the key "a" has a
	 * value, set the key "b" to have that value, and set the key "a" to have the
	 * value "". Basically "b" is a bully, taking the value and replacing it with
	 * the empty string.
	 */
	public Map<String, String> mapBully(Map<String, String> map) {
		String value_a = map.get("a");
		if(value_a != null && value_a.length() > 0) {
			map.put("b",value_a);
			map.put("a","");
		}
		return map;
	}

	// url :: https://codingbat.com/prob/p148813
	/*
	 * Statement :: Modify and return the given map as follows: if the key "a" has a
	 * value, set the key "b" to have that same value. In all cases remove the key
	 * "c", leaving the rest of the map unchanged.
	 */
	public Map<String, String> mapShare(Map<String, String> map) {
		String value_a = map.get("a");
		if(value_a != null && value_a.length() > 0) {
			map.put("b",value_a);
		}
		map.remove("c");
		return map;
	}

	// url :: https://codingbat.com/prob/p107259
	/*
	 * Statement :: Modify and return the given map as follows: for this problem the
	 * map may or may not contain the "a" and "b" keys. If both keys are present,
	 * append their 2 string values together and store the result under the key
	 * "ab".
	 */
	public Map<String, String> mapAB(Map<String, String> map) {
		String value_a = map.get("a");
		String value_b = map.get("b");
		if(value_a != null && value_a.length() > 0) {
			if(value_b != null && value_b.length() > 0) {
				map.put("ab",value_a + value_b);
			}
		}
		return map;
	}

	// url :: https://codingbat.com/prob/p182712
	/*
	 * Statement :: Given a map of food keys and topping values, modify and return
	 * the map as follows: if the key "ice cream" is present, set its value to
	 * "cherry". In all cases, set the key "bread" to have the value "butter".
	 */
	public Map<String, String> topping1(Map<String, String> map) {
		String value_ice_cream = map.get("ice cream");
		if(value_ice_cream != null && value_ice_cream.length() > 0) {
			map.put("ice cream","cherry");
		}
		map.put("bread","butter");
		return map;
	}

	// url :: https://codingbat.com/prob/p196458
	/*
	 * Statement :: Given a map of food keys and their topping values, modify and
	 * return the map as follows: if the key "ice cream" has a value, set that as
	 * the value for the key "yogurt" also. If the key "spinach" has a value, change
	 * that value to "nuts".
	 */
	public Map<String, String> topping2(Map<String, String> map) {
		
		String value_ice_cream = map.get("ice cream");
		if(value_ice_cream != null && value_ice_cream.length() > 0) {
			map.put("yogurt",value_ice_cream);
		}
		
		String value_spinach = map.get("spinach");
		if(value_spinach != null && value_spinach.length() > 0) {
			map.put("spinach","nuts");
		}
		return map;
	}

	// url :: https://codingbat.com/prob/p128461
	/*
	 * Statement :: Given a map of food keys and topping values, modify and return
	 * the map as follows: if the key "potato" has a value, set that as the value
	 * for the key "fries". If the key "salad" has a value, set that as the value
	 * for the key "spinach".
	 */
	public Map<String, String> topping3(Map<String, String> map) {
		
		String value_potato = map.get("potato");
		if(value_potato != null && value_potato.length() > 0) {
			map.put("fries",value_potato);
		}
		
		String value_salad = map.get("salad");
		if(value_salad != null && value_salad.length() > 0) {
			map.put("spinach",value_salad);
		}
		return map;
	}

	// url :: https://codingbat.com/prob/p115011
	/*
	 * Statement :: Modify and return the given map as follows: if the keys "a" and
	 * "b" are both in the map and have equal values, remove them both.
	 */
	public Map<String, String> mapAB2(Map<String, String> map) {
		String value_a = map.get("a");
		String value_b = map.get("b");
		if(value_a != null) {
			if(value_b != null) {
				if(value_a.equals(value_b)) {
					map.remove("a");
					map.remove("b");
				}
			}
		}
		return map;
	}

	// url :: https://codingbat.com/prob/p115012
	/*
	 * Statement :: Modify and return the given map as follows: if exactly one of
	 * the keys "a" or "b" has a value in the map (but not both), set the other to
	 * have that same value in the map.
	 */
	public Map<String, String> mapAB3(Map<String, String> map) {
		String value_a = map.get("a");
		String value_b = map.get("b");
		if(value_a != null && value_b == null) {
			map.put("b",value_a);
		}
		if(value_a == null && value_b != null) {
			map.put("a",value_b);
		}
		return map;
	}

	// url :: https://codingbat.com/prob/p136950
	/*
	 * Statement :: Modify and return the given map as follows: if the keys "a" and
	 * "b" have values that have different lengths, then set "c" to have the longer
	 * value. If the values exist and have the same length, change them both to the
	 * empty string in the map.
	 */
	public Map<String, String> mapAB4(Map<String, String> map) {
		String value_a = map.get("a");
		String value_b = map.get("b");
		if(value_a != null) {
			if(value_b != null) {
				if(value_a.length() == value_b.length()) {
					map.put("a","");
					map.put("b","");
				} else {
					String value = value_a.length() > value_b.length() ? value_a : value_b;
					map.put("c",value);
				}
			}
		}
		return map;
	}

}

