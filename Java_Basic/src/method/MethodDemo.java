package method;

public class MethodDemo {

	public static void main(String[] args) {
		int result = sum(100, 215);
		
		System.out.println(result);
		
		printHello();
		
		String[] m = {"cho", "kim", "moon", "jung", "jang", "123"};
		System.out.println(lastString(m));
	}
	
	// First Method
	// int 정수 2개를 받아 합을 리턴
	static int sum(int i, int j) {	
		int result = i + j;
		return result;
	}
	
	static void printHello() {
		System.out.println("Hello~~~");
	}
	
	// 스트링 배열을 입력 받아 마지막 인덱스의 문자열을 리턴
	static String lastString(String[] messages) {
		String result = null;
		int len = messages.length;
		result = messages[len - 1];
		
		return result;
	}

}
