package problems;

public class Warmup2 {
	// url :: https://codingbat.com/java/Warmup-2

	// url :: https://codingbat.com/prob/p142270
	/*
	 * Statement :: Given a string and a non-negative int n, return a larger string
	 * that is n copies of the original string.
	 */
	public String stringTimes(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p101475
	/*
	 * Statement :: Given a string and a non-negative int n, we'll say that the
	 * front of the string is the first 3 chars, or whatever is there if the string
	 * is less than length 3. Return n copies of the front;
	 */
	public String frontTimes(String str, int n) {
		String result = "";
		int end = str.length() < 3 ? str.length() : 3;
		String subStr =  str.substring(0,end);
		for (int i = 0; i < n; i++) {
			result += subStr;
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p194667
	/*
	 * Statement :: Count the number of "xx" in the given string. We'll say that
	 * overlapping is allowed, so "xxx" contains 2 "xx".
	 */
	public int countXX(String str) {
		if(str.length() < 2) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if(str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
				count++;
			}
		}
		return count;
	}

	// url :: https://codingbat.com/prob/p186759
	/*
	 * Statement :: Given a string, return true if the first instance of "x" in the
	 * string is immediately followed by another "x".
	 */
	public boolean doubleX(String str) {
		return (str.indexOf("x") != -1) && (str.indexOf("x") == str.indexOf("xx"));
	}

	// url :: https://codingbat.com/prob/p165666
	/*
	 * Statement :: Given a string, return a new string made of every other char
	 * starting with the first, so "Hello" yields "Hlo".
	 */
	public String stringBits(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i = i + 2 ) {
			result += str.charAt(i);
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p117334
	/*
	 * Statement :: Given a non-empty string like "Code" return a string like
	 * "CCoCodCode".
	 */
	public String stringSplosion(String str) {
		String result = "";
		for (int i = 1; i < str.length() + 1; i++ ) {
			result += str.substring(0,i);
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p178318
	/*
	 * Statement :: Given a string, return the count of the number of times that a
	 * substring length 2 appears in the string and also as the last 2 chars of the
	 * string, so "hixxxhi" yields 1 (we won't count the end substring).
	 */
	public int last2(String str) {
		if(str.length() < 3) {
			return 0;
		}
		int count = 0;
		int len = str.length();
		char first = str.charAt(len - 2);
		char second = str.charAt(len - 1);
		for (int i = 0; i < len - 2; i++) {
			if(str.charAt(i) == first && str.charAt(i+1) == second) {
				count++;
			}
		}
		return count;
	}

	// url :: https://codingbat.com/prob/p184031
	/*
	 * Statement :: Given an array of ints, return the number of 9's in the array.
	 */
	public int arrayCount9(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 9) {
				result++;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p186031
	/*
	 * Statement :: Given an array of ints, return true if one of the first 4
	 * elements in the array is a 9. The array length may be less than 4.
	 */
	public boolean arrayFront9(int[] nums) {
		int len = nums.length < 4 ? nums.length : 4;
		for (int i = 0; i < len; i++) {
			if(nums[i] == 9) {
				return true;
			}
		}
		return false;
	}

	// url :: https://codingbat.com/prob/p136041
	/*
	 * Statement :: Given an array of ints, return true if .. 1, 2, 3, .. appears in
	 * the array somewhere.
	 */
	public boolean array123(int[] nums) {
		boolean isPresent_1 = false, isPresent_2 = false,isPresent_3 = false;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				isPresent_1 = true;
			}
			if(nums[i] == 2) {
				isPresent_2 = true;
			}
			if(nums[i] == 3) {
				isPresent_3 = true;
			}
		}
		return isPresent_1 && isPresent_2 && isPresent_3;
	}

	// url :: https://codingbat.com/prob/p198640
	/*
	 * Statement :: Given 2 strings, a and b, return the number of the positions
	 * where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz"
	 * yields 3, since the "xx", "aa", and "az" substrings appear in the same place
	 * in both strings.
	 */
	public int stringMatch(String a, String b) {
		int minLen = a.length() < b.length() ? a.length() : b.length();
		if(minLen < 2) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i < minLen - 1; i++) {
			if(a.charAt(i) == b.charAt(i)) {
				if(a.charAt(i + 1) == b.charAt(i + 1)) {
					result++;
				}
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p171260
	/*
	 * Statement :: Given a string, return a version where all the "x" have been
	 * removed. Except an "x" at the very start or end should not be removed.
	 */
	public String stringX(String str) {
		if(str.length() < 3) {
			return str;
		}
		String result = "" + str.charAt(0);
		int len = str.length();
		for (int i = 1; i < len - 1; i++) {
			char current = str.charAt(i);
			if(current != 'x') {
				result += str.charAt(i);
			}
		}
		result += str.charAt(len -1);
		return result;
	}

	// url :: https://codingbat.com/prob/p121596
	/*
	 * Statement :: Given a string, return a string made of the chars at indexes
	 * 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
	 */
	public String altPairs(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if(i % 4 != 2 && i % 4 != 3) {
				result += str.charAt(i);
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p126212
	/*
	 * Statement :: Suppose the string "yak" is unlucky. Given a string, return a
	 * version where all the "yak" are removed, but the "a" can be any char. The
	 * "yak" strings will not overlap.
	 */
	public String stringYak(String str) {
		return str.replaceAll("yak", "");
	}

	// url :: https://codingbat.com/prob/p110019
	/*
	 * Statement :: Given an array of ints, return the number of times that two 6's
	 * are next to each other in the array. Also count instances where the second
	 * "6" is actually a 7.
	 */
	public int array667(int[] nums) {
		int result = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7) ) {
				result++;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p170221
	/*
	 * Statement :: Given an array of ints, we'll say that a triple is a value
	 * appearing 3 times in a row in the array. Return true if the array does not
	 * contain any triples.
	 */
	public boolean noTriples(int[] nums) {
		int len = nums.length;
		if(len < 3) {
			return true;
		}
		int count = 0;
		for (int i = 0; i < len - 1; i++) {
			if(nums[i] == nums[i+ 1]) {
				count++;
			} else {
				count = 0;
			}
			if(count == 2) {
				return false;
			}
		}
		return true;
	}

	// url :: https://codingbat.com/prob/p167430
	/*
	 * Statement :: Given an array of ints, return true if it contains a 2, 7, 1
	 * pattern -- a value, followed by the value plus 5, followed by the value minus
	 * 1. Additionally the 271 counts even if the "1" differs by 2 or less from the
	 * correct value.
	 */
	public boolean has271(int[] nums) {
		int len = nums.length;
		if(len < 3) {
			return false;
		}
		for (int i = 0; i < len -2; i++) {
			int value = nums[i];
			if(value + 5 == nums[i + 1]) {
				if(Math.abs(value - 1 - nums[i + 2]) < 3) {
					return true;
				}
			}
		}
		return false;
	}

}