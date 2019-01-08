package excercise;


public class BasicTutorial {

	/*
	 * 정수 리스트에서 최고값을 찾아라
	 * 
	 */
	public static void main(String[] args) {

		int[] numbers = {-1, -10, -5, -99, -70, 87};
		int maxNum = findMax(numbers);
		
		System.out.println("최대값: " + maxNum);
	}

	/**
	 * 입력: 정수배열
	 * 리턴: 정수 배열 중 최고값
	 * 
	 * 최초 최대값: 첫번째(0) 인덱스값
	 * 배열 전체를 돌면서 내가 알고 있는 최대값과 해당 인덱스의 배열의 값을 비교 
	 * 
	 */
	public static int findMax(int[] nums) {
		
		int max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (max < nums[i]) {
				max = nums[i];
			}
		}
	
		return max;
	}
	
}













