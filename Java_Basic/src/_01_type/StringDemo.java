package _01_type;

public class StringDemo {

	public static void main(String[] args) {
		// boolean type 참/거짓
		boolean result = 1 != 2;
		
		// 문자 정보
		String name = "lim choi kim park lee";
		char ch = 'a';
		char ch1 = '한';
		
		System.out.println(result);
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.charAt(5));
	}

}
