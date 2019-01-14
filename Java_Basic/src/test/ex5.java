package test;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1234";
		int num2 = numbers(a);
		System.out.println("ÇÕ : " + num2);

	}

	/*
	 * 
	 * ¹®ÀÚ¿­À» ÀÔ·Â ¹Þ¾Æ, ¹®ÀÚ¿­ Áß¿¡¼­ ¼ýÀÚÀÎ °ÍµéÀÇ ÇÕÀ» ±¸ÇÏ¿© ¸®ÅÏÇÏ´Â ¸Þ¼Òµå
	 * 
	 * ÀÔ·Â: String Ãâ·Â: int
	 * 
	 * "598"--> 5+9+8 "8t9"--> 8+9
	 */
	static int numbers(String num) {
		String[] str = new String[4];
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum += (ch - 48);
				System.out.println(sum);
			}

		}

		return sum;

	}

}