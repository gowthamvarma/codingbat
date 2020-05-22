package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
	// url :: https://codingbat.com/java/Functional-2

	// url :: https://codingbat.com/prob/p103456
	/*
	 * Statement :: Given a list of integers, return a list of the integers,
	 * omitting any that are less than 0.
	 */
	public List<Integer> noNeg(List<Integer> nums) {
		return nums.stream().filter(x -> x > -1 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p124510
	/*
	 * Statement :: Given a list of non-negative integers, return a list of those
	 * numbers except omitting any that end with 9. (Note: % by 10)
	 */
	public List<Integer> no9(List<Integer> nums) {
		return nums.stream().filter(x -> x % 10 != 9 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p137274
	/*
	 * Statement :: Given a list of integers, return a list of those numbers,
	 * omitting any that are between 13 and 19 inclusive.
	 */
	public List<Integer> noTeen(List<Integer> nums) {
		return nums.stream().filter(x -> x < 13 || x > 19 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p105671
	/*
	 * Statement :: Given a list of strings, return a list of the strings, omitting
	 * any string that contains a "z". (Note: the str.contains(x) method returns a
	 * boolean)
	 */
	public List<String> noZ(List<String> strings) {
		return strings.stream().filter(str -> !str.contains("z") )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p194496
	/*
	 * Statement :: Given a list of strings, return a list of the strings, omitting
	 * any string length 4 or more.
	 */
	public List<String> noLong(List<String> strings) {
		return strings.stream().filter(str -> str.length() < 4 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p184496
	/*
	 * Statement :: Given a list of strings, return a list of the strings, omitting
	 * any string length 3 or 4.
	 */
	public List<String> no34(List<String> strings) {
		return strings.stream().filter(str -> str.length() < 3 || str.length() > 4 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p115967
	/*
	 * Statement :: Given a list of strings, return a list where each string has "y"
	 * added at its end, omitting any resulting strings that contain "yy" as a
	 * substring anywhere.
	 */
	public List<String> noYY(List<String> strings) {
		return strings.stream().map(x -> x + "y").filter(str -> !str.contains("yy") )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p148198
	/*
	 * Statement :: Given a list of non-negative integers, return a list of those
	 * numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
	 */
	public List<Integer> two2(List<Integer> nums) {
		return nums.stream().map(x -> x * 2).filter(x -> x % 10 != 2 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

	// url :: https://codingbat.com/prob/p132748
	/*
	 * Statement :: Given a list of integers, return a list of those numbers squared
	 * and the product added to 10, omitting any of the resulting numbers that end
	 * in 5 or 6.
	 */
	public List<Integer> square56(List<Integer> nums) {
		return nums.stream().map(x -> 10 + x * x).filter(x -> x % 10 != 5 && x % 10 != 6 )
				.collect(Collectors.toCollection(ArrayList::new));
	}

}


