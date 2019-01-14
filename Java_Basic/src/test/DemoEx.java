package test;

public class DemoEx {
	/**
	 * 문자열을 입력 받아, 문자열 중에서 숫자인 것들의 합을 구하여 리턴하는 메소드
	 */
	public static void main(String[] args) {

		String m = "1234";
		int result = sumvalue(m);
		System.out.println(result);

	}

	public static int sumvalue(String str) {
		boolean idigit = true;
		int sum = 0;
		int i = 0;

		for (i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {

				sum = sum + (str.charAt(i) - 48);

			}
			
			System.out.println(sum);
			int num = Integer.parseInt(str);

			for (i = 0; i < str.length(); i++) {
				if (num >= '0' && num <= '9') {

					sum = sum + i;

				}

			}
			System.out.println(sum);
			// System.out.println(str);

		}
		return sum;
	}

}