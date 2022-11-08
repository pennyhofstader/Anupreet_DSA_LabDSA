package com.greatlearning.dsaLab.Question2;

import com.greatlearning.dsaLab.Question2.FindPairSumFunction.Node;

public class FindPairSumMain {
	// Driver code
	public static void main(String[] args) {
		Node root = null;
		int sum = 110;
		FindPairSumFunction findSumPair = new FindPairSumFunction();
		root = findSumPair.insert(root, 40);
		root = findSumPair.insert(root, 20);
		root = findSumPair.insert(root, 60);
		root = findSumPair.insert(root, 10);
		root = findSumPair.insert(root, 30);
		root = findSumPair.insert(root, 50);
		root = findSumPair.insert(root, 70);
		System.out.println("Sum = " + sum);
		findSumPair.findPairOfSum(root, sum);
	}

}
