package com.practice.hackkerank.Logical_Questions;

//import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Solution {

	static SortedMap<Character, Integer> counter(String word) {
		SortedMap<Character, Integer> sm = new TreeMap<Character, Integer>();
		for (int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i)) || Character.isLowerCase(word.charAt(i))) {
				sm.put(Character.toLowerCase(word.charAt(i)), 0);
			}
		}
		for (int i = 0; i < word.length(); i++) {
			if(Character.isUpperCase(word.charAt(i)) || Character.isLowerCase(word.charAt(i))) {
				sm.put(Character.toLowerCase(word.charAt(i)), sm.get(Character.toLowerCase(word.charAt(i))) + 1);
			}
		}
		return sm;
	}

	static boolean isAnagram(String a, String b) {
		if (a.length() == b.length()) {
			return counter(a).equals(counter(b));

		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
