package problems;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	// url :: https://codingbat.com/java/Map-2

	// url :: https://codingbat.com/prob/p152303
	/*
	 * Statement :: Given an array of strings, return a Map<String, Integer>
	 * containing a key for every different string in the array, always with the
	 * value 0. For example the string "hello" makes the pair "hello":0. We'll do
	 * more complicated counting later, but for this problem the value is simply 0.
	 */
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			result.put(strings[i], 0);
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p125327
	/*
	 * Statement :: Given an array of strings, return a Map<String, Integer>
	 * containing a key for every different string in the array, and the value is
	 * that string's length.
	 */
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			result.put(strings[i], strings[i].length());
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p126332
	/*
	 * Statement :: Given an array of non-empty strings, create and return a
	 * Map<String, String> as follows: for each string add its first character as a
	 * key with its last character as the value.
	 */
	public Map<String, String> pairs(String[] strings) {
		Map<String, String> result = new HashMap<>();
		if(strings.length == 0) {
			return result;
		}
		for (int i = 0; i < strings.length; i++) {
			result.put(""+strings[i].charAt(0), 
					""+strings[i].charAt(strings[i].length() - 1));
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p117630
	/*
	 * Statement :: The classic word-count algorithm: given an array of strings,
	 * return a Map<String, Integer> with a key for each different string, with the
	 * value the number of times that string appears in the array.
	 */
	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			Integer count = result.get(strings[i]);
			if(count == null) {
				result.put(strings[i], 1);
			} else {
				result.put(strings[i], count + 1);
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p168493
	/*
	 * Statement :: Given an array of non-empty strings, return a Map<String,
	 * String> with a key for every different first character seen, with the value
	 * of all the strings starting with that character appended together in the
	 * order they appear in the array.
	 */
	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> result = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			String key = "" + strings[i].charAt(0);
			String current = result.get(key);
			if(current == null) {
				result.put(key, "" + strings[i]);
			} else {
				result.put(key, current + strings[i]);
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p103593
	/*
	 * Statement :: Loop over the given array of strings to build a result string
	 * like this: when a string appears the 2nd, 4th, 6th, etc. time in the array,
	 * append the string to the result. Return the empty string if no string appears
	 * a 2nd time.
	 */
	public String wordAppend(String[] strings) {
		int len = strings.length;
		if(len == 0) {
			return "";
		}
		String result = "";
		Map<String,Integer> countMap = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			Integer current = countMap.get(strings[i]);
			if(current == null) {
				countMap.put(strings[i], 1);
			} else {
				countMap.put(strings[i], current + 1);
				if(current % 2 == 1) {
					result += strings[i];
				}
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p190862
	/*
	 * Statement :: Given an array of strings, return a Map<String, Boolean> where
	 * each different string is a key and its value is true if that string appears 2
	 * or more times in the array.
	 */
	public Map<String, Boolean> wordMultiple(String[] strings) {
		Map<String, Boolean> result = new HashMap<String, Boolean>();;
		for (int i = 0; i < strings.length; i++) {
			Boolean current = result.get(strings[i]);
			if(current == null) {
				result.put(strings[i], false);
			} else {
				result.put(strings[i], true);
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p134133
	/*
	 * Statement :: We'll say that 2 strings "match" if they are non-empty and their
	 * first chars are the same. Loop over and then return the given array of
	 * non-empty strings as follows: if a string matches an earlier string in the
	 * array, swap the 2 strings in the array. When a position in the array has been
	 * swapped, it no longer matches anything. Using a map, this can be solved
	 * making just one pass over the array. More difficult than it looks.
	 */
	public String[] allSwap(String[] strings) {
		Map<String, Integer> myMap = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			Integer index = myMap.get(strings[i].substring(0,1));
			if(index == null) {
				 myMap.put(strings[i].substring(0,1),i);
			} else {
				// swapping
				String temp = strings[index];
				strings[index] = strings[i];
				strings[i] = temp;
				// clearing
				 myMap.remove(strings[i].substring(0,1));
			}
		}
		return strings;
	}

	// url :: https://codingbat.com/prob/p150113
	/*
	 * Statement :: We'll say that 2 strings "match" if they are non-empty and their
	 * first chars are the same. Loop over and then return the given array of
	 * non-empty strings as follows: if a string matches an earlier string in the
	 * array, swap the 2 strings in the array. A particular first char can only
	 * cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
	 * Using a map, this can be solved making just one pass over the array. More
	 * difficult than it looks.
	 */
	public String[] firstSwap(String[] strings) {
		Map<String, Integer> myMap = new HashMap<>();
		for (int i = 0; i < strings.length; i++) {
			Integer index = myMap.get(strings[i].substring(0,1));
			if(index == null) {
				 myMap.put(strings[i].substring(0,1),i);
			} else if(index == -1) {
				
			} else {
				// swapping
				String temp = strings[index];
				strings[index] = strings[i];
				strings[i] = temp;
				// clearing
				myMap.put(strings[i].substring(0,1),-1);
			}
		}
		return strings;
	}

}
	