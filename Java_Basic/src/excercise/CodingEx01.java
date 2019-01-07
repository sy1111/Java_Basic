package excercise;

import java.util.Arrays;

public class CodingEx01 {

	public static void main(String[] args) {
		/*
		 * long sum = multipleSum(1234243324);
		 * 
		 * System.out.println("1000미만의 3과 5의 배수의 총합: " + sum);
		 */
		
		/*
		 * String a = "대\t한\t민국"; System.out.println(a);
		 * 
		 * //a = convertTab(a); a = convertTab2(a.toCharArray()); System.out.println(a);
		 */
		
		/*
		 * int num = calcPageNum(0, 1); System.out.println(num);
		 */
		
		int[] m = {1, 0, -5};
		
		long time1 = System.currentTimeMillis();
		int[] result = specialSort(m);
		long time2 = System.currentTimeMillis();
		System.out.println(Arrays.toString(result));
		System.out.println("걸린시간: " + (time2 - time1));
	}
	
	/*
	 * 입력: 정수 
	 * 출력: 정수 (총합)
	 * 
	 * 입력받은 정수 미만의 3과 5의 배수의 총합을 구하고,
	 * 그 총합을 리턴
	 * 
	 * limit 미만의 자연수만큼 반복
	 *   숫자가 3의 배수인지 5의 배수인지 판단
	 *     참 --> 더하고
	 *     
	 * 
	 */
	static long multipleSum(int limit) {
		long result = 0;
		
		for (int i = 1; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				result = result + i;
			}
		}
		
		return result;
	}
	
	/**
	 * 입력: 문자열
	 * 출력: 변경된 문자열
	 * 
	 * 입력된 문자열에서 탭 캐릭터를 공백4개로 교체
	 *  "abc\tacd" --> "abc    acd"
	 *  
	 *  1st
	 *  해당 기능을 하는 String class 기능
	 *  
	 *  2nd
	 *  캐릭터배열 
	 *  해당문자열의 길이 탭키의 수
	 *  
	 */
	static String convertTab(String str) {
		String result = str.replace("\t", "    ");
		
		return result;
	}
	
	static String convertTab2(char[] str) {
		int totalLen = str.length;
		int numOfTabs = 0;
		for (int i = 0; i < totalLen; i++) {
			if (str[i] == '\t') {
				numOfTabs++;
			}
		}
		
		int newLen = totalLen - numOfTabs + numOfTabs * 4;
		char[] newStr = new char[newLen];
		int step = 0;
		for (int i = 0; i < totalLen; i++) {
			if (str[i] != '\t') {
				newStr[step] = str[i];
			} else {
				newStr[step++] = ' ';
				newStr[step++] = ' ';
				newStr[step++] = ' ';
				newStr[step] = ' ';
			}
			
			step++;
		}
		
		return new String(newStr);
	}
	
	/**
	 * 게시물의 페이지 수 계산
	 * 
	 * 입력: 총게시물의 수 , 페이지 당 게시물의 수
	 * 출력: 페이지 수
	 * 
	 * 총게시물의 수 / 페이지당 수 + (총게시물 수 % 페이지당 수 나머지가 있으면 1을 더함)
	 */
	static int calcPageNum(int totalBlogCount, int numOfBlogsPerPage) {
		int numOfPages = totalBlogCount / numOfBlogsPerPage;
		if (totalBlogCount % numOfBlogsPerPage > 0) {
			numOfPages++;
		}
		
		return numOfPages;
	}
	
	/**
	 * 입력: 무작위 정수의 배열
	 * 출력: 특별히 소트된 배열
	 * 
	 * 입력값 중 음수가 좌측으로 양수는 우측으로 
	 * 원래 음수와 양수의 순서는 그대로 유지
	 * 
	 * 로직.
	 *  0. 입력 배열의 모든 요소를 돌면서, 음수의 갯수를 센다.
	 *  1. 음수 / 양수 배열을 만든다.
	 *  2. 입력 배열을 모두 돌면서, 음의 수가 나오면 음의 배열로,
	 *     양의 수가 나오면 양의 배열로 복사
	 *  3. 결과 배열을 만든다(입력배열의 크기)
	 *  4. 음의 배열의 요소모두를 결과배열에 복사
	 *  5. 양의 배열의 요소 모두를 결과 배열에 복사   
	 * 
	 */
	static int[] specialSort(int[] numbers) {
		int numOfNegatives = 0;
		int numOfPositives = 0;
		
		if (numbers == null) {
			return null;
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				numOfNegatives++;
			}
		}
		
		numOfPositives = numbers.length - numOfNegatives;
		
		if (numOfNegatives == 0 || numOfPositives == 0) {
			return numbers;
		}
		
		int[] negatives = new int[numOfNegatives];
		int[] positives = new int[numOfPositives];
		
		int negIndex = 0;
		int posIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				negatives[negIndex] = numbers[i];
				negIndex++;
 			} else {
 				positives[posIndex] = numbers[i];
 				posIndex++;
 			}
		}
		
		int resultArray[] = new int[numbers.length];
		int resultIndex = 0;
		for (int i = 0; i < negatives.length; i++) {
			resultArray[resultIndex] = negatives[i];
			resultIndex++;
		}
		
		for (int i = 0; i < positives.length; i++) {
			resultArray[resultIndex] = positives[i];
			resultIndex++;
		}
		
		return resultArray;
	}
}
