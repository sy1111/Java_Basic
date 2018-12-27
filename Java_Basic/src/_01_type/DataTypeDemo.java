package _01_type;

public class DataTypeDemo {

	public static void main(String[] args) {
		// 저장해야 할 정보
		// 숫자 / 문자(스트링)
		// 정수 / 실수 
		// 정수 : byte short char int long
		// 실수 : float double
		
		long age = (int)11235125123423L;
		int var1 = (int)150L;
		long width = 1111;
		var1 = var1 + 5;
		
		long var11 = 1111L;
		var11 = var11 * 2;
		
		var1 = (int)var11;
		
		double var2 = 15.2;
		var2 = var2 * 2.23423;
		
		float var3 = 66.2f;
		var3 = var3 / 1.0f;
		
		var2 = var3;
		var3 = (float)var2;
		
		double result = 3.0 / 2;
		int remainder = 5 % 3;
		
		System.out.println(result);
		System.out.println(remainder);
	}

}
