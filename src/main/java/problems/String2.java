package problems;

public class String2 {
	// url :: https://codingbat.com/java/String-2

	// url :: https://codingbat.com/prob/p165312
	/*
	 * Statement :: Given a string, return a string where for every char in the
	 * original, there are two chars.
	 */
	public String doubleChar(String str) {
		return null;
	}

	// url :: https://codingbat.com/prob/p147448
	/*
	 * Statement :: Return the number of times that the string "hi" appears anywhere
	 * in the given string.
	 */
	public int countHi(String str) {
		return 0;
	}

	// url :: https://codingbat.com/prob/p111624
	/*
	 * Statement :: Return true if the string "cat" and "dog" appear the same number
	 * of times in the given string.
	 */
	public boolean catDog(String str) {
		return false;
	}

	// url :: https://codingbat.com/prob/p123614
	/*
	 * Statement :: Return the number of times that the string "code" appears
	 * anywhere in the given string, except we'll accept any letter for the 'd', so
	 * "cope" and "cooe" count.
	 */
	public int countCode(String str) {
		return 0;
	}

	// url :: https://codingbat.com/prob/p126880
	/*
	 * Statement :: Given two strings, return true if either of the strings appears
	 * at the very end of the other string, ignoring upper/lower case differences
	 * (in other words, the computation should not be "case sensitive"). Note:
	 * str.toLowerCase() returns the lowercase version of a string.
	 */
	public boolean endOther(String a, String b) {
		return false;
	}

	// url :: https://codingbat.com/prob/p136594
	/*
	 * Statement :: Return true if the given string contains an appearance of "xyz"
	 * where the xyz is not directly preceeded by a period (.). So "xxyz" counts but
	 * "x.xyz" does not.
	 */
	public boolean xyzThere(String str) {
		return false;
	}

	// url :: https://codingbat.com/prob/p175762
	/*
	 * Statement :: Return true if the given string contains a "bob" string, but
	 * where the middle 'o' char can be any char.
	 */
	public boolean bobThere(String str) {
		return false;
	}

	// url :: https://codingbat.com/prob/p134250
	/*
	 * Statement :: We'll say that a String is xy-balanced if for all the 'x' chars
	 * in the string, there exists a 'y' char somewhere later in the string. So
	 * "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
	 * Return true if the given string is xy-balanced.
	 */
	public boolean xyBalance(String str) {
		return false;
	}

	// url :: https://codingbat.com/prob/p125185
	/*
	 * Statement :: Given two strings, a and b, create a bigger string made of the
	 * first char of a, the first char of b, the second char of a, the second char
	 * of b, and so on. Any leftover chars go at the end of the result.
	 */
	public String mixString(String a, String b) {
		return null;
	}

	// url :: https://codingbat.com/prob/p152339
	/*
	 * Statement :: Given a string and an int n, return a string made of n
	 * repetitions of the last n characters of the string. You may assume that n is
	 * between 0 and the length of the string, inclusive.
	 */
	public String repeatEnd(String str, int n) {
		return null;
	}

	// url :: https://codingbat.com/prob/p128796
	/*
	 * Statement :: Given a string and an int n, return a string made of the first n
	 * characters of the string, followed by the first n-1 characters of the string,
	 * and so on. You may assume that n is between 0 and the length of the string,
	 * inclusive (i.e. n >= 0 and n <= str.length()).
	 */
	public String repeatFront(String str, int n) {
		return null;
	}

	// url :: https://codingbat.com/prob/p109637
	/*
	 * Statement :: Given two strings, word and a separator sep, return a big string
	 * made of count occurrences of the word, separated by the separator string.
	 */
	public String repeatSeparator(String word, String sep, int count) {
		return null;
	}

	// url :: https://codingbat.com/prob/p136417
	/*
	 * Statement :: Given a string, consider the prefix string made of the first N
	 * chars of the string. Does that prefix string appear somewhere else in the
	 * string? Assume that the string is not empty and that N is in the range
	 * 1..str.length().
	 */
	public boolean prefixAgain(String str, int n) {
		return false;
	}

	// url :: https://codingbat.com/prob/p159772
	/*
	 * Statement :: Given a string, does "xyz" appear in the middle of the string?
	 * To define middle, we'll say that the number of chars to the left and right of
	 * the "xyz" must differ by at most one. This problem is harder than it looks.
	 */
	public boolean xyzMiddle(String str) {
		return false;
	}

	// url :: https://codingbat.com/prob/p129952
	/*
	 * Statement :: A sandwich is two pieces of bread with something in between.
	 * Return the string that is between the first and last appearance of "bread" in
	 * the given string, or return the empty string "" if there are not two pieces
	 * of bread.
	 */
	public String getSandwich(String str) {
		return null;
	}

	// url :: https://codingbat.com/prob/p194491
	/*
	 * Statement :: Returns true if for every '*' (star) in the string, if there are
	 * chars both immediately before and after the star, they are the same.
	 */
	public boolean sameStarChar(String str) {
		return false;
	}

	// url :: https://codingbat.com/prob/p122943
	/*
	 * Statement :: Given a string, compute a new string by moving the first char to
	 * come after the next two chars, so "abc" yields "bca". Repeat this process for
	 * each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any
	 * group of fewer than 3 chars at the end.
	 */
	public String oneTwo(String str) {
		return null;
	}

	// url :: https://codingbat.com/prob/p180759
	/*
	 * Statement :: Look for patterns like "zip" and "zap" in the string --
	 * length-3, starting with 'z' and ending with 'p'. Return a string where for
	 * all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
	 */
	public String zipZap(String str) {
		return null;
	}

	// url :: https://codingbat.com/prob/p139564
	/*
	 * Statement :: Return a version of the given string, where for every star (*)
	 * in the string the star and the chars immediately to its left and right are
	 * gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	 */
	public String starOut(String str) {
		return null;
	}

	// url :: https://codingbat.com/prob/p170829
	/*
	 * Statement :: Given a string and a non-empty word string, return a version of
	 * the original String where all chars have been replaced by pluses ("+"),
	 * except for appearances of the word string which are preserved unchanged.
	 */
	public String plusOut(String str, String word) {
		return null;
	}

	// url :: https://codingbat.com/prob/p147538
	/*
	 * Statement :: Given a string and a non-empty word string, return a string made
	 * of each char just before and just after every appearance of the word in the
	 * string. Ignore cases where there is no char before or after the word, and a
	 * char may be included twice if it is between two words.
	 */
	public String wordEnds(String str, String word) {
		return null;
	}

}
