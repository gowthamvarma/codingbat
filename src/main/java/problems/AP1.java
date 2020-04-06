package problems;

public class AP1 {
	// url :: https://codingbat.com/java/AP-1

	// url :: https://codingbat.com/prob/p146974
	/*
	 * Statement :: Given an array of scores, return true if each score is equal or
	 * greater than the one before. The array will be length 2 or more.
	 */
	public boolean scoresIncreasing(int[] scores) {
		return false;
	}

	// url :: https://codingbat.com/prob/p179487
	/*
	 * Statement :: Given an array of scores, return true if there are scores of 100
	 * next to each other in the array. The array length will be at least 2.
	 */
	public boolean scores100(int[] scores) {
		return false;
	}

	// url :: https://codingbat.com/prob/p194530
	/*
	 * Statement :: Given an array of scores sorted in increasing order, return true
	 * if the array contains 3 adjacent scores that differ from each other by at
	 * most 2, such as with {3, 4, 5} or {3, 5, 5}.
	 */
	public boolean scoresClump(int[] scores) {
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
		return 0;
	}

	// url :: https://codingbat.com/prob/p124620
	/*
	 * Statement :: Given an array of strings, return the count of the number of
	 * strings with the given length.
	 */
	public int wordsCount(String[] words, int len) {
		return 0;
	}

	// url :: https://codingbat.com/prob/p183837
	/*
	 * Statement :: Given an array of strings, return a new array containing the
	 * first N strings. N will be in the range 1..length.
	 */
	public String[] wordsFront(String[] words, int n) {
		return null;
	}

	// url :: https://codingbat.com/prob/p183407
	/*
	 * Statement :: Given an array of strings, return a new List (e.g. an ArrayList)
	 * where all the strings of the given length are omitted. See wordsWithout()
	 * below which is more difficult because it uses arrays.
	 */
	public String[] wordsWithoutList(String[] words, int len) {
		return null;
	}

	// url :: https://codingbat.com/prob/p191212
	/*
	 * Statement :: Given a positive int n, return true if it contains a 1 digit.
	 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.
	 */
	public boolean hasOne(int n) {
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
		return false;
	}

	// url :: https://codingbat.com/prob/p134174
	/*
	 * Statement :: Given an array of positive ints, return a new array of length
	 * "count" containing the first even numbers from the original array. The
	 * original array will contain at least "count" even numbers.
	 */
	public int[] copyEvens(int[] nums, int count) {
		return null;
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
		return null;
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
		return 0;
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
		return 0;
	}

	// url :: https://codingbat.com/prob/p121236
	/*
	 * Statement :: Given an array of strings, return a new array without the
	 * strings that are equal to the target string. One approach is to count the
	 * occurrences of the target string, make a new array of the correct length, and
	 * then copy over the correct strings.
	 */
	public String[] wordsWithout(String[] words, String target) {
		return null;
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
		return 0;
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
		return 0;
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
		return 0;
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
		return 0;
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
		return 0;
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
		return null;
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
		return 0;
	}

}

