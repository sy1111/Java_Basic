package loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		// Array
		// 같은 데이터 타입의 정보를 여러개 담고자 할때

		int[] numbers;
		
		numbers = new int[10];
		
		numbers[0] = 10;
		numbers[1] = 9;
				
		int i = 0;

		while (i < numbers.length) {
			System.out.println(numbers[i]);
			++i;
		}

		i = 100;

		int result = i; // bad
		--i;
		System.out.println(result);
		System.out.println(i);
	}

}
