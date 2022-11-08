package com.greatlearning.dsaLab.Question1;

public class BalancedBracketsMain {

	// Driver code
	public static void main(String[] args) {

		String input1 = "([[{}]])";
		String input2 = "([[{}]]))";

		// output for first input
		System.out.print("Given Input : " + input1 + " -> ");

		if (BalancedBracketsFunction.IsBalanced(input1))

			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

		// output for first input
		System.out.print("Given Input : " + input2 + " -> ");

		if (BalancedBracketsFunction.IsBalanced(input2))

			System.out.println("The entered String has Balanced Brackets ");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");

	}

}
