package com.practice.hackkerank.Logical_Questions;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
	public static List<Integer> rotateLeft(int d, List<Integer> arr) {
		List<Integer> rotetatedList = new ArrayList<Integer>();
		for (int i = d; i < arr.size(); i++) {
			rotetatedList.add(arr.get(i));
		}
		for (int j = 0; j < d; j++) {
			rotetatedList.add(arr.get(j));
		}

		for (int p : rotetatedList)
			System.out.println(p);
		return rotetatedList;

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		rotateLeft(4, list);
	}

}
