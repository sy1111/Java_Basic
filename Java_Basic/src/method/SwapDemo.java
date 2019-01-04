package method;

public class SwapDemo {

	public static void main(String[] args) {
		
		int a = 10;
		int b = -5;
		
		int[] numbers = {10, -5};
		
		System.out.println("before");
		System.out.println("0 = " + numbers[0]);
		System.out.println("1 = " + numbers[1]);
		
		// swap Method
		// call by value vs. call by reference
		//swap(a, b);
		swapArray(numbers);
		
		System.out.println("after");
		System.out.println("0 = " + numbers[0]);
		System.out.println("1 = " + numbers[1]);
	}
	
	/*
	 * 입력 정수 두개를 받아서,
	 * 두개 값을 교체
	 */
	static void swap(int i, int j) {
		System.out.println("swap: before");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		int temp = i;
		i = j;
		j = temp;
		
		System.out.println("swap: after");
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
	
	/**
	 * 입력받은 정수 배열에서,
	 * 0번째 / 1번째 값을 교체
	 * 
	 */
	static void swapArray(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = temp;
	}

}
