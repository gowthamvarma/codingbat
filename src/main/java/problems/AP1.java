package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AP1 {
	// url :: https://codingbat.com/java/AP-1

	// url :: https://codingbat.com/prob/p146974
	/*
	 * Statement :: Given an array of scores, return true if each score is equal or
	 * greater than the one before. The array will be length 2 or more.
	 */
	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if(scores[i] > scores[i+1]) {
				return false;
			}
		}
		return true;
	}

	// url :: https://codingbat.com/prob/p179487
	/*
	 * Statement :: Given an array of scores, return true if there are scores of 100
	 * next to each other in the array. The array length will be at least 2.
	 */
	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if(scores[i] == 100 && scores[i+1] == 100) {
				return true;
			}
		}
		return false;
	}

	// url :: https://codingbat.com/prob/p194530
	/*
	 * Statement :: Given an array of scores sorted in increasing order, return true
	 * if the array contains 3 adjacent scores that differ from each other by at
	 * most 2, such as with {3, 4, 5} or {3, 5, 5}.
	 */
	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if(scores[i + 1] - scores[i] < 3 && scores[i + 2] - scores[i] < 3) {
				return true;
			}
		}
		return false;
	}

	// url :: https://codingbat.com/prob/p123837
	/*
	 * Statement :: Given an array of scores, compute the int average of the first
	 * half and the second half, and return whichever is larger. We'll say that the
	 * second half begins at index length/2. The array length will be at least 2. To
	 * practice decomposition, write a separate helper method int average(int[]
	 * scores, int start, int end) { which computes the average of the elements
	 * between indexes start..end. Call your helper method twice to implement
	 * scoresAverage(). Write your helper method after your scoresAverage() method
	 * in the JavaBat text area. Normally you would compute averages with doubles,
	 * but here we use ints so the expected results are exact.
	 */
	public int scoresAverage(int[] scores) {
		int len = scores.length;
		int average_1 = avg(scores, 0,len/2);
		int average_2 = avg(scores, len/2 , len);
		return average_1 > average_2 ? average_1 : average_2;
	}

	private int avg(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += scores[i];
		}
		return sum / (end - start);
	}

	// url :: https://codingbat.com/prob/p124620
	/*
	 * Statement :: Given an array of strings, return the count of the number of
	 * strings with the given length.
	 */
	public int wordsCount(String[] words, int len) {
		int result = 0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() == len) {
				result++;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p183837
	/*
	 * Statement :: Given an array of strings, return a new array containing the
	 * first N strings. N will be in the range 1..length.
	 */
	public String[] wordsFront(String[] words, int n) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = words[i];
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p183407
	/*
	 * Statement :: Given an array of strings, return a new List (e.g. an ArrayList)
	 * where all the strings of the given length are omitted. See wordsWithout()
	 * below which is more difficult because it uses arrays.
	 */
	public String[] wordsWithoutList(String[] words, int len) {
		List<String> temp = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if(words[i].length() != len) {
				temp.add(words[i]);
			}
		}
		
		Object[] gfg= temp.toArray();
		String[] strArray = Arrays.copyOf(gfg,gfg.length,String[].class);
		
		return strArray;
	}

	// url :: https://codingbat.com/prob/p191212
	/*
	 * Statement :: Given a positive int n, return true if it contains a 1 digit.
	 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 */
	public boolean hasOne(int n) {
		while(n > 0) {
			if(n % 10 == 1) {
				return true;
			}
			n = n / 10;
		}
		return false;
	}

	// url :: https://codingbat.com/prob/p165941
	/*
	 * Statement :: We'll say that a positive int divides itself if every digit in
	 * the number divides into the number evenly. So for example 128 divides itself
	 * since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not
	 * divide into anything evenly, so no number with a 0 digit divides itself.
	 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 */
	public boolean dividesSelf(int n) {
		int number = n;
		while(n > 0) {
			int digit = n % 10;
			if(digit == 0) {
				return false;
			}
			if(number % digit != 0)  {
				return false;
			}
			n = n / 10;
		}
		return true;
	}

	// url :: https://codingbat.com/prob/p134174
	/*
	 * Statement :: Given an array of positive ints, return a new array of length
	 * "count" containing the first even numbers from the original array. The
	 * original array will contain at least "count" even numbers.
	 */
	public int[] copyEvens(int[] nums, int count) {
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				result[index++] = nums[i];
			}
			if(index == count) {
				break;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p130124
	/*
	 * Statement :: We'll say that a positive int n is "endy" if it is in the range
	 * 0..10 or 90..100 (inclusive). Given an array of positive ints, return a new
	 * array of length "count" containing the first endy numbers from the original
	 * array. Decompose out a separate isEndy(int n) method to test if a number is
	 * endy. The original array will contain at least "count" endy numbers.
	 */
	public int[] copyEndy(int[] nums, int count) {
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if( (num >= 0 && num <= 10) || (num >= 90 && num <= 100)) {
				result[index++] = nums[i];
			}
			if(index == count) {
				break;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p139677
	/*
	 * Statement :: Given 2 arrays that are the same length containing strings,
	 * compare the 1st string in one array to the 1st string in the other array, the
	 * 2nd to the 2nd and so on. Count the number of times that the 2 strings are
	 * non-empty and start with the same char. The strings may be any length,
	 * including 0.
	 */
	public int matchUp(String[] a, String[] b) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			String str_a = a[i];
			String str_b = b[i];
			if(str_a != null && str_a.length() > 0) {
				if(str_b != null && str_b.length() > 0) {
					if(str_a.charAt(0) == str_b.charAt(0)) {
						result++;
					}
				}
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p180365
	/*
	 * Statement :: The "key" array is an array containing the correct answers to an
	 * exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's
	 * answers, with "?" representing a question left blank. The two arrays are not
	 * empty and are the same length. Return the score for this array of answers,
	 * giving +4 for each correct answer, -1 for each incorrect answer, and +0 for
	 * each blank answer.
	 */
	public int scoreUp(String[] key, String[] answers) {
		int result = 0;
		for (int i = 0; i < key.length; i++) {
			String str_key = key[i];
			String str_answers = answers[i];
			if(str_answers.equals("?")) {
				
			} else if(str_answers.equals(str_key)) {
				result += 4;
			} else {
				result -= 1;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p121236
	/*
	 * Statement :: Given an array of strings, return a new array without the
	 * strings that are equal to the target string. One approach is to count the
	 * occurrences of the target string, make a new array of the correct length, and
	 * then copy over the correct strings.
	 */
	public String[] wordsWithout(String[] words, String target) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if(words[i].equals(target)){
				count++;
			}
		}
		int index = 0;
		String[] result = new String[words.length - count];
		for (int i = 0; i < words.length; i++) {
			if(!words[i].equals(target)){
				result[index++] = words[i];
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p140485
	/*
	 * Statement :: Given two arrays, A and B, of non-negative int scores. A
	 * "special" score is one which is a multiple of 10, such as 40 or 90. Return
	 * the sum of largest special score in A and the largest special score in B. To
	 * practice decomposition, write a separate helper method which finds the
	 * largest special score in an array. Write your helper method after your
	 * scoresSpecial() method in the JavaBat text area.
	 */
	public int scoresSpecial(int[] a, int[] b) {
		int special_a = specialScore(a);
		int special_b = specialScore(b);
		return special_a + special_b ;
	}

	private int specialScore(int[] a) {
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] % 10 == 0 && a[i] > result) {
				result = a[i];
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p148138
	/*
	 * Statement :: We have an array of heights, representing the altitude along a
	 * walking trail. Given start/end indexes into the array, return the sum of the
	 * changes for a walk beginning at the start index and ending at the end index.
	 * For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum
	 * of 1 + 5 = 6. The start end end index will both be valid indexes into the
	 * array with start <= end.
	 */
	public int sumHeights(int[] heights, int start, int end) {
		int result = 0;
		for (int i = start; i < end; i++) {
			result += Math.abs(heights[i] - heights[i+1]);
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p157900
	/*
	 * Statement :: (A variation on the sumHeights problem.) We have an array of
	 * heights, representing the altitude along a walking trail. Given start/end
	 * indexes into the array, return the sum of the changes for a walk beginning at
	 * the start index and ending at the end index, however increases in height
	 * count double. For example, with the heights {5, 3, 6, 7, 2} and start=2,
	 * end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be valid
	 * indexes into the array with start <= end.
	 */
	public int sumHeights2(int[] heights, int start, int end) {
		int result = 0;
		for (int i = start; i < end; i++) {
			int change = heights[i + 1] - heights[i];
			if(change > 0) {
				result +=  2 * change;
			} else {
				result += -1 * change;
			}
			
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p197710
	/*
	 * Statement :: (A variation on the sumHeights problem.) We have an array of
	 * heights, representing the altitude along a walking trail. Given start/end
	 * indexes into the array, return the number of "big" steps for a walk starting
	 * at the start index and ending at the end index. We'll say that step is big if
	 * it is 5 or more up or down. The start end end index will both be valid
	 * indexes into the array with start <= end.
	 */
	public int bigHeights(int[] heights, int start, int end) {
		int result = 0;
		for (int i = start; i < end; i++) {
			 if(Math.abs(heights[i] - heights[i+1]) >= 5) {
				 result++;
			 }
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p143482
	/*
	 * Statement :: We have data for two users, A and B, each with a String name and
	 * an int id. The goal is to order the users such as for sorting. Return -1 if A
	 * comes before B, 1 if A comes after B, and 0 if they are the same. Order first
	 * by the string names, and then by the id numbers if the names are the same.
	 * Note: with Strings str1.compareTo(str2) returns an int value which is
	 * negative/0/positive to indicate how str1 is ordered to str2 (the value is not
	 * limited to -1/0/1). (On the AP, there would be two User objects, but here the
	 * code simply takes the two strings and two ints directly. The code logic is
	 * the same.)
	 */
	public int userCompare(String aName, int aId, String bName, int bId) {
		int result = aName.compareTo(bName);
		if(result < 0) {
			return -1;
		} 
		if(result > 0) {
			return 1;
		}
		if(result == 0) {
			if(aId < bId) {
				return -1;
			} 
			if(aId > bId) {
				return 1;
			} 
			// redundant but good to write
			if(aId == bId) {
				return 0;
			}
		}
		return result;
	}

	// url :: https://codingbat.com/prob/p139150
	/*
	 * Statement :: Start with two arrays of strings, A and B, each with its
	 * elements in alphabetical order and without duplicates. Return a new array
	 * containing the first N elements from the two arrays. The result array should
	 * be in alphabetical order and without duplicates. A and B will both have a
	 * length which is N or more. The best "linear" solution makes a single pass
	 * over A and B, taking advantage of the fact that they are in alphabetical
	 * order, copying elements directly to the new array.
	 */
	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
	    int index_a = 0;
	    int index_b = 0;
	        
	    for(int index = 0; index < n; index++) {
	        if(a[index_a].compareTo(b[index_b]) < 0) {
	            result[index] = a[index_a];
	            index_a++;
	        } else if(a[index_a].compareTo(b[index_b]) > 0) {
	            result[index] = b[index_b];
	            index_b++;
	        } else {
	            result[index] = a[index_a];
	            index_a++;
	            index_b++;
	        }
	    }
	                                                                        
	    return result;
	}

	// url :: https://codingbat.com/prob/p100369
	/*
	 * Statement :: Start with two arrays of strings, a and b, each in alphabetical
	 * order, possibly with duplicates. Return the count of the number of strings
	 * which appear in both arrays. The best "linear" solution makes a single pass
	 * over both arrays, taking advantage of the fact that they are in alphabetical
	 * order.
	 */
	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		int index_a = 0;
		int index_b = 0;

		if (a[0].equals(b[0])) {
			count++;
			index_a++;
			index_b++;
		} else if (a[0].compareTo(b[0]) < 0) {
			index_a++;
		} else {
			index_b++;
		}

		while (index_a < a.length && index_b < b.length) {
			if (index_a > 0 && a[index_a - 1].equals(a[index_a])) {
				index_a++;
			} else if (a[index_a].equals(b[index_b])) {
				count++;
				index_a++;
				index_b++;
			} else if (a[index_a].compareTo(b[index_b]) < 0) {
				index_a++;
			} else {
				index_b++;
			}
		}

		return count;
	}

}

