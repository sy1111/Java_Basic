package excercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodingEx02 {

	public static void main(String[] args) {
		String m = "numOfPieX123";

		// String result = ConvertPotholeCase(m);
		System.out.println(ConvertPotholeCase(m));
	}

	/**
	 * camelCase --> PotholeCase
	 * 
	 * ex) "numOfPies" --> "num_of_pies"
	 */
	public static String ConvertPotholeCase(String input) {

		// 1. 대문자를 소문자로 바꾸고 앞 글자에 '_' 추가
		int inputSize = input.length();

		//System.out.println(inputSize);
		for (int i = 0; i < input.length(); i++) {
			//System.out.println(input.charAt(i));
			if (Character.isUpperCase(input.charAt(i))) {
				// 'c' --> "c"
				String str = String.valueOf(input.charAt(i));
				input = input.replace(str, "_" + str.toLowerCase());
				//System.out.println("string size: " + str + " " + i + " " + input.length());
				i++;
			}

		}

		inputSize = input.length();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= '0' && input.charAt(i) <= '9') { // '1' --> "1"
				//System.out.println(input.charAt(i));
				String str = String.valueOf(input.charAt(i));
				input = input.replace(str, "_" + str);
				i++;
			}
		}

		/*
		 * // 2. 숫자 앞에 '_' 추가 Pattern p = Pattern.compile("\\d"); Matcher m =
		 * p.matcher(input);
		 * 
		 * while (m.find()) input = input.replace(m.group(0), "_" + m.group(0));
		 */

		return input;
	}
}
