package excercise;

import java.util.Calendar;
import java.util.Locale;

public class NumberEx {

	public static void main(String[] args) {
		//printDoubleGob(1.55, 8.89, 6);
		
		 long n = 461012;
	      System.out.format("%d%n", n);      //  -->  "461012"
	      System.out.format("%08d%n", n);    //  -->  "00461012"
	      System.out.format("%+8d%n", n);    //  -->  " +461012"
	      System.out.format("%,8d%n", n);    // -->  " 461,012"
	      System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
	      
	      double pi = Math.PI;

	      System.out.format("%f%n", pi);       // -->  "3.141593"
	      System.out.format("%.3f%n", pi);     // -->  "3.142"
	      System.out.format("%10.3f%n", pi);   // -->  "     3.142"
	      System.out.format("%-10.3f%n", pi);  // -->  "3.142    "
	      System.out.format(Locale.FRANCE,
	                        "%-10.4f%n%n", pi); // -->  "3,1416"

	      Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"

	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"

	      System.out.format("%tD%n", c);    // -->  "05/29/06"
	}

	/*
	 * 정수값 2개와 캐릭터 1개를 입력 받아 사칙연산 및 나머지
	 * 
	 * 입력: int, int, char( +, -, *, /, %)
	 * 리턴: int   
	 */
	public static int numOperation(int a, int b, char op) {
		int result = 0;
		if (op == '+') {
			result = a + b;
		} else if (op == '-') {
			result = a - b;
		} else if (op == '*') {
			result = a * b;
		} else if (op == '/') {
			result = a / b;
		} else if (op == '%') {
			result = a % b;
		} else {
			System.out.println("잘못된 연산 코드입니다.");
			return 0;
		}
		
		return result;
	}
	
	/*
	 * 실수 곱하기를 하는데, 소수점 자리를 입력 받아 그만큼 정확도로
	 * 프린트 하기
	 * 
	 * 입력: double, double, int
	 * 리턴: void
	 */
	public static void printDoubleGob(double a, double b, int num) {
		double result = a * b;
		String format = "%." + num + "f";
		//System.out.println(format);
		
		System.out.printf(format, result);
	}
}












