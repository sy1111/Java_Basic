package _02_control;

public class StringLower {

	// 문자열이 주어지고,
	// 해당 문자열의 첫 글자를 소문자로 변경하여 출력하시오.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m = "KEskTop";
		
		// deskTop / cesktop 으로 출력
		char ch = m.charAt(0);
		// 문자열의 첫번째(0) 인덱스의 캐릭터가 대문자인경우,
		if (ch >= 'A' && ch <= 'Z') {
			// 대문자 --> 소문자
			char temp = (char)(ch + 32);
			String s = m.substring(1);
			
			s = temp + s;
			
			System.out.println(s);
		} else {
			System.out.println(m);
		}
	}

}
