package excercise;

import java.util.Arrays;

public class NumberEx02 {

	public static void main(String[] args) {
		int[] arr = {1, 9, -7, -88, 0, 11, -3, 2, 8, -11};
		/*
		 * System.out.println(Arrays.toString(arr)); System.out.println("최소값: " +
		 * minArray(arr));
		 */
		
		/*
		 * int[] sortedArr = sortArray(arr);
		 * System.out.println(Arrays.toString(sortedArr));
		 * System.out.println(Arrays.toString(arr));
		 */
		double[] arr2 = {5.5, 6.6, 99.1, 7.56, 60.1};
		System.out.println("배열의 평균: " + avgList(arr2));
	}
	
	/**
	 * 정수 배열에서 최소값을 찾는 함수
	 * 입력: int[]
	 * 리턴: int
	 * 
	 * 
	 */
	public static int minArray(int[] numbers) {
		int min = numbers[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		
		return min;
	}
	
	/**
	 * 정수 배열을 입력 받아 오름차순으로 정렬한 새로운 배열을 리턴
	 * 입력: int[]
	 * 리턴: int[]
	 * 
	 */
	public static int[] sortArray(int[] nums) {
		// 배열 복사
		/*
		 * int[] sortedNums = new int[nums.length]; for (int i = 0; i < nums.length;
		 * i++) { sortedNums[i] = nums[i]; }
		 */
		int[] sortedNums = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sortedNums);

		return sortedNums;
	}
	
	public static int[] mySortedArray(int[] nums) {
		int[] sortedNums = Arrays.copyOf(nums, nums.length); 
	
		for (int j = 0; j < sortedNums.length-1; j++) {
			for (int i = 1; i < (sortedNums.length -j); i++) {
				if (sortedNums[i] < sortedNums[i-1]) {
					int temp = sortedNums[i];
					sortedNums[i] = sortedNums[i-1];
					sortedNums[i-1] = temp;
				}
			}
		}
		
		return sortedNums;
		
	}
	
	
	/*
	 * 실수 배열을 입력받아, 평균을 리턴
	 * 입력: double[]
	 * 리턴: double
	 * 
	 */
	public static double avgList(double[] nums) {
		
		return 0.0;
	}
}



















