package _02_control;

import java.util.Arrays;

public class StringCompare {

	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		String c = new String("abc");
		
		System.out.println(a);
		System.out.println(c);
		
		if (a.equals(c)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		int[] num1 = { 1, 2, 3};
		int[] num2 = {1, 2, 3};
		
		
		//if (num1.equals(num2)) {
		if (Arrays.equals(num1, num2)) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
	}

}
